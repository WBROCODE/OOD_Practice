package Predicate.ComplexComparator;

import java.util.List;

import Predicate.Predicate;

public class OrComparator implements ComplexComparator {

    private List<Predicate> operands;

    public OrComparator(List<Predicate> predicate) {
        this.operands = predicate;
    }

    @Override
    public boolean isMatch(File.File file) {
        for (Predicate o : operands) {
            if (o.isMatch(file)) return true;
        }
        return false;
    }
}
