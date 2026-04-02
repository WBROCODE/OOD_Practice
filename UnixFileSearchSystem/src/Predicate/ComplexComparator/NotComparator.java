package Predicate.ComplexComparator;

import Predicate.Predicate;

public class NotComparator implements ComplexComparator {

    private Predicate operand;

    public NotComparator(Predicate predicate) {
        this.operand = predicate;
    }

    @Override
    public boolean isMatch(File.File file) {
        return !operand.isMatch(file);
    }
}
