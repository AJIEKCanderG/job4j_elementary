package ru.job4j.collection;

import java.util.Comparator;

public class SortByNameJobs implements Comparator<Jobs> {
    @Override
    public int compare(Jobs first, Jobs second) {
        return first.getName().compareTo(second.getName());
    }
}
