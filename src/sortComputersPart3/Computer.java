package sortComputersPart3;

import java.util.Objects;

public class Computer implements Comparable<Computer> {
    private String name;
    private int cpu;
    private int ramMemory;

    public Computer(String name, int cpu, int ramMemory) {
        this.name = name;
        this.cpu = cpu;
        this.ramMemory = ramMemory;
    }

    public String getName() {
        return name;
    }

    public int getCpu() {
        return cpu;
    }

    public int getRamMemory() {
        return ramMemory;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", cpu=" + cpu +
                ", ramMemory=" + ramMemory +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return cpu == computer.cpu &&
                ramMemory == computer.ramMemory &&
                Objects.equals(name, computer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cpu, ramMemory);
    }

    @Override
    public int compareTo(Computer computer) {
        if(computer == null){
            throw new NullPointerException("Komputer nie moze byc nullem!");
        }
        return this.name.compareTo(computer.name);
    }
}
