package sortComputersPart3;

import java.util.Comparator;

public class CpuComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer c1, Computer c2) {
        if(c1 == null && c2 == null)
            return 0;
        if(c1 == null && c2 != null)
            return -1;
        if(c1 != null && c2 == null)
            return 1;

        return Integer.compare(c1.getCpu(),c2.getCpu());
    }
}
