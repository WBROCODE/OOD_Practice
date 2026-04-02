package Predicate.ComplexComparator;

import java.util.List;

import Predicate.Predicate;

public class AndComparator implements ComplexComparator {

    private List<Predicate> operands;

    public AndComparator(List<Predicate> predicate) {
        this.operands = predicate;
    }

    @Override
    public boolean isMatch(File.File file) {
        for (Predicate o : operands) {
            if (!o.isMatch(file)) return false;
        }
        return true;
    }
}
