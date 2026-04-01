package Predicate.ComplexComparator;

import java.util.List;

public class OrComparator implements ComplexComparator {

    private List<Predicate.Predicate> operands;

    public OrComparator(List<Predicate.Predicate> predicate) {
        this.operands = predicate;
    }

    @Override
    public boolean isMatch(File.File file) {
        for (Predicate.Predicate o : operands) {
            if (o.isMatch(file)) return true;
        }
        return false;
    }
}
