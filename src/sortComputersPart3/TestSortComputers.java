package sortComputersPart3;

import java.util.*;

public class TestSortComputers {
    private static final String SORT_CPU = "cpu";
    private static final String SORT_MEMORY = "ram";
    private static final String SORT_NAME = "name";

    public static void main(String[] args) {
        try {
            Computer[] computers = createComputers();
            Comparator<Computer> comparator = chooseComparator();
            System.out.println(Arrays.toString(computers));
            Arrays.sort(computers, comparator);
            for (Computer computer : computers) {
                System.out.println(computer);
            }
        }catch (NullPointerException e){
                System.err.println(e.getMessage());
            }
    }

    private static Comparator<Computer> chooseComparator() {
        System.out.println("Po czym sortujemy?");
        System.out.println("ram? cpu? name?");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        Comparator<Computer> comparator = null;

        switch (choice) {
            case SORT_CPU:
                comparator = new CpuComparator();
                break;
            case SORT_MEMORY:
                comparator = new RamMemoryComparator();
                break;
            case SORT_NAME:
                comparator = new NameComparator();
                break;
            default:
                System.out.println("niepoprawny typ sortowania");
                System.exit(0);
        }
        return comparator;
    }

    private static Computer[] createComputers() {
        return new Computer[]{
                new Computer("Asus", 2600, 32),
                new Computer("Dell", 1800, 8),
                new Computer("Dell", 1800, 12),
                null,
                new Computer("Dell", 1600, 16),
                new Computer("Apple", 1600, 16)
        };
    }
}