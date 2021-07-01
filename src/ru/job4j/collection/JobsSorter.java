package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JobsSorter {
    public static void main(String[] args) {
        List<Jobs> jobs = Arrays.asList(
                new Jobs("Fix bugs", 4),
                new Jobs("Impl task", 2),
                new Jobs("Reboot server", 1)
        );
        System.out.println(jobs);
        Collections.sort(jobs);
        System.out.println(jobs);
        jobs.sort(new SortByNameJobs());
        System.out.println(jobs);
    }
}