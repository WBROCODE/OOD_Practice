package Search;

import java.util.ArrayList;
import java.util.List;

import File.File;
import Predicate.Predicate;

public class FileSearchCondition {
    private final Predicate predicate;

    public FileSearchCondition(Predicate predicate) {
        this.predicate = predicate;
    }

    public List<File> search(File root) {
        List<File> results = new ArrayList<>();
        searchHelper(root, results);
        return results;
    }

    private void searchHelper(File file, List<File> results) {
        if (predicate.isMatch(file)) {
            results.add(file);
        }
        for (File entry : file.getEntryFiles()) {
            searchHelper(entry, results);
        }
    }
}
