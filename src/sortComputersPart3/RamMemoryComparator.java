package sortComputersPart3;

import java.util.Comparator;

public class RamMemoryComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer c1, Computer c2) {
        if(c1 == null || c2 == null){
            throw new NullPointerException("Komputer nie moze byc nullem!");
        }
        return Integer.compare(c1.getRamMemory(),c2.getRamMemory());
    }
}
