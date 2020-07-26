package sortComputersPart3;

import java.util.Comparator;

public class NameComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer c1, Computer c2) {
        if(c1 == null || c2 == null){
            throw new NullPointerException("Komputer nie moze byc nullem!");
        }
        return c1.getName().compareTo(c2.getName());
    }
}
