import java.util.ArrayList;
import java.util.List;

import File.File;
import File.FileAttribute;
import Comparator.EqualComparator;
import Comparator.GreaterComparator;
import Comparator.LessComparator;
import Comparator.RegexComparator;
import Predicate.Predicate;
import Predicate.SimplePredicate.SimplePredicate;
import Predicate.ComplexComparator.AndComparator;
import Predicate.ComplexComparator.OrComparator;
import Predicate.ComplexComparator.NotComparator;
import Search.FileSearchCondition;

public class App {
    private static int passed = 0;
    private static int failed = 0;

    public static void main(String[] args) {
        File root = buildFileTree();

        System.out.println("========== Unix File Search System Tests ==========\n");

        testEqualComparator_ByName(root);
        testEqualComparator_ByOwner(root);
        testGreaterComparator_BySize(root);
        testLessComparator_BySize(root);
        testRegexComparator_ByName(root);
        testAndComparator(root);
        testOrComparator(root);
        testNotComparator(root);
        testNestedComplexPredicates(root);
        testSearchDirectoryOnly(root);
        testNoMatch(root);

        System.out.println("\n========== Results ==========");
        System.out.println("Passed: " + passed + " / " + (passed + failed));
        if (failed > 0) {
            System.out.println("FAILED: " + failed + " test(s)");
        } else {
            System.out.println("All tests passed!");
        }
    }

    private static File buildFileTree() {
        //  root/
        //  ├── report.txt     (size=100, owner=adam)
        //  ├── data.csv       (size=200, owner=bob)
        //  ├── docs/          (dir, owner=adam)
        //  │   ├── notes.txt  (size=150, owner=adam)
        //  │   └── readme.md  (size=50, owner=alice)
        //  └── images/        (dir, owner=bob)
        //      ├── logo.png   (size=500, owner=bob)
        //      └── icon.svg   (size=30, owner=alice)
        File root = new File("root", 0, "adam", true);

        File file1 = new File("report.txt", 100, "adam", false);
        File file2 = new File("data.csv", 200, "bob", false);
        root.addEntry(file1);
        root.addEntry(file2);

        File dir1 = new File("docs", 0, "adam", true);
        File file3 = new File("notes.txt", 150, "adam", false);
        File file4 = new File("readme.md", 50, "alice", false);
        root.addEntry(dir1);
        dir1.addEntry(file3);
        dir1.addEntry(file4);

        File dir2 = new File("images", 0, "bob", true);
        File file5 = new File("logo.png", 500, "bob", false);
        File file6 = new File("icon.svg", 30, "alice", false);
        root.addEntry(dir2);
        dir2.addEntry(file5);
        dir2.addEntry(file6);

        return root;
    }

    private static void testEqualComparator_ByName(File root) {
        Predicate p = new SimplePredicate<>(FileAttribute.FILE_NAME, new EqualComparator<>(), "data.csv");
        FileSearchCondition search = new FileSearchCondition(p);
        List<File> results = search.search(root);

        assertTest("EqualComparator - find by name 'data.csv'",
                results.size() == 1 && results.get(0).getName().equals("data.csv"));
    }

    private static void testEqualComparator_ByOwner(File root) {
        Predicate p = new SimplePredicate<>(FileAttribute.OWNER, new EqualComparator<>(), "alice");
        FileSearchCondition search = new FileSearchCondition(p);
        List<File> results = search.search(root);

        assertTest("EqualComparator - find by owner 'alice'",
                results.size() == 2 && results.stream().allMatch(f -> f.getName().equals("readme.md") || f.getName().equals("icon.svg")));
    }

    private static void testGreaterComparator_BySize(File root) {
        Predicate p = new SimplePredicate<>(FileAttribute.SIZE, new GreaterComparator<>(), 100);
        FileSearchCondition search = new FileSearchCondition(p);
        List<File> results = search.search(root);

        assertTest("GreaterComparator - size > 100",
                results.size() == 3 && results.stream().allMatch(
                        f -> f.getName().equals("data.csv") || f.getName().equals("notes.txt") || f.getName().equals("logo.png")));
    }

    private static void testLessComparator_BySize(File root) {
        Predicate p = new SimplePredicate<>(FileAttribute.SIZE, new LessComparator<>(), 100);
        FileSearchCondition search = new FileSearchCondition(p);
        List<File> results = search.search(root);

        assertTest("LessComparator - size < 100",
                results.size() == 5);
    }

    private static void testRegexComparator_ByName(File root) {
        Predicate p = new SimplePredicate<>(FileAttribute.FILE_NAME, new RegexComparator<>(), ".*\\.txt");
        FileSearchCondition search = new FileSearchCondition(p);
        List<File> results = search.search(root);

        assertTest("RegexComparator - name matches '*.txt'",
                results.size() == 2 && results.stream().allMatch(
                        f -> f.getName().equals("report.txt") || f.getName().equals("notes.txt")));
    }

    private static void testAndComparator(File root) {
        Predicate ownerAdam = new SimplePredicate<>(FileAttribute.OWNER, new EqualComparator<>(), "adam");
        Predicate sizeLess200 = new SimplePredicate<>(FileAttribute.SIZE, new LessComparator<>(), 200);
        List<Predicate> predicates = new ArrayList<>();
        predicates.add(ownerAdam);
        predicates.add(sizeLess200);
        Predicate combined = new AndComparator(predicates);

        FileSearchCondition search = new FileSearchCondition(combined);
        List<File> results = search.search(root);

        assertTest("AndComparator - owner='adam' AND size<200",
                results.size() == 4 && results.stream().allMatch(
                        f -> f.getName().equals("report.txt") || f.getName().equals("notes.txt")
                                || f.getName().equals("root") || f.getName().equals("docs")));
    }

    private static void testOrComparator(File root) {
        Predicate ownerBob = new SimplePredicate<>(FileAttribute.OWNER, new EqualComparator<>(), "bob");
        Predicate ownerAlice = new SimplePredicate<>(FileAttribute.OWNER, new EqualComparator<>(), "alice");
        List<Predicate> predicates = new ArrayList<>();
        predicates.add(ownerBob);
        predicates.add(ownerAlice);
        Predicate combined = new OrComparator(predicates);

        FileSearchCondition search = new FileSearchCondition(combined);
        List<File> results = search.search(root);

        assertTest("OrComparator - owner='bob' OR owner='alice'",
                results.size() == 5);
    }

    private static void testNotComparator(File root) {
        Predicate isDir = new SimplePredicate<>(FileAttribute.IS_DIRECTORY, new EqualComparator<>(), true);
        Predicate notDir = new NotComparator(isDir);

        FileSearchCondition search = new FileSearchCondition(notDir);
        List<File> results = search.search(root);

        assertTest("NotComparator - NOT isDirectory (files only)",
                results.size() == 6 && results.stream().noneMatch(
                        f -> f.getName().equals("root") || f.getName().equals("docs") || f.getName().equals("images")));
    }

    private static void testNestedComplexPredicates(File root) {
        Predicate txtFile = new SimplePredicate<>(FileAttribute.FILE_NAME, new RegexComparator<>(), ".*\\.txt");
        Predicate bigFile = new SimplePredicate<>(FileAttribute.SIZE, new GreaterComparator<>(), 120);
        Predicate ownerBob = new SimplePredicate<>(FileAttribute.OWNER, new EqualComparator<>(), "bob");

        // (name=*.txt AND size>120) OR owner=bob
        List<Predicate> andList = new ArrayList<>();
        andList.add(txtFile);
        andList.add(bigFile);
        Predicate andPart = new AndComparator(andList);

        List<Predicate> orList = new ArrayList<>();
        orList.add(andPart);
        orList.add(ownerBob);
        Predicate nested = new OrComparator(orList);

        FileSearchCondition search = new FileSearchCondition(nested);
        List<File> results = search.search(root);

        assertTest("Nested - (*.txt AND size>120) OR owner='bob'",
                results.size() == 4 && results.stream().allMatch(
                        f -> f.getName().equals("notes.txt") || f.getName().equals("data.csv")
                                || f.getName().equals("logo.png") || f.getName().equals("images")));
    }

    private static void testSearchDirectoryOnly(File root) {
        Predicate isDir = new SimplePredicate<>(FileAttribute.IS_DIRECTORY, new EqualComparator<>(), true);
        FileSearchCondition search = new FileSearchCondition(isDir);
        List<File> results = search.search(root);

        assertTest("Search directories only",
                results.size() == 3 && results.stream().allMatch(
                        f -> f.getName().equals("root") || f.getName().equals("docs") || f.getName().equals("images")));
    }

    private static void testNoMatch(File root) {
        Predicate p = new SimplePredicate<>(FileAttribute.FILE_NAME, new EqualComparator<>(), "nonexistent.java");
        FileSearchCondition search = new FileSearchCondition(p);
        List<File> results = search.search(root);

        assertTest("No match - file does not exist", results.size() == 0);
    }

    private static void assertTest(String testName, boolean condition) {
        if (condition) {
            System.out.println("[PASS] " + testName);
            passed++;
        } else {
            System.out.println("[FAIL] " + testName);
            failed++;
        }
    }
}
