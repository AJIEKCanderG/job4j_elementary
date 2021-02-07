package ru.job4j.collections;

import java.util.Comparator;

public class SortByNameJob implements Comparator<Job> {
    @Override
    public int compare(Job first, Job second) {
        return first.getName().compareTo(second.getName());
    }
}
