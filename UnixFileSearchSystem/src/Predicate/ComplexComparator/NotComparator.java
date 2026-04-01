package Predicate.ComplexComparator;

public class NotComparator implements ComplexComparator {

    private Predicate.Predicate operand;

    public NotComparator(Predicate.Predicate predicate) {
        this.operand = predicate;
    }

    @Override
    public boolean isMatch(File.File file) {
        return !operand.isMatch(file);
    }
}
