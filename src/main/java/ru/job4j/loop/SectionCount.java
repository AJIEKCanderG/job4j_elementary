package ru.job4j.loop;

public class SectionCount {
    public static int count(int length, int section) {
        int count = 0;
        while (length > 0) {
            length = length - section;
            if (length >= 0) {
                count++;
            }
        }
        return count;
    }
}