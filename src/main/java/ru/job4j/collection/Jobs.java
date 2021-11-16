package ru.job4j.collection;

public class Jobs implements Comparable<Jobs> {
    private final String name;

    private final int priority;

    public Jobs(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Job{"
                + "name='" + name + '\''
                + ", priority=" + priority
                + '}';
    }

    @Override
    public int compareTo(Jobs another) {
        return Integer.compare(priority, another.priority);
    }
}