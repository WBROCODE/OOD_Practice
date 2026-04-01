package Predicate.ComplexComparator;

import java.util.List;

public class AndComparator implements ComplexComparator {

    private List<Predicate.Predicate> operands;

    public AndComparator(List<Predicate.Predicate> predicate) {
        this.operands = predicate;
    }

    @Override
    public boolean isMatch(File.File file) {
        for (Predicate.Predicate o : operands) {
            if (!o.isMatch(file)) return false;
        }
        return true;
    }
}
