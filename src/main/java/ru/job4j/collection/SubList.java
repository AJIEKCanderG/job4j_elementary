package ru.job4j.collection;

import java.util.List;

public class SubList {
    public static List<String> getElementsBetweenIndexes(List<String> list, String el) {
        return list.subList(list.indexOf(el), list.lastIndexOf(el));
    }
}