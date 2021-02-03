package ru.job4j.collections;

import java.util.ArrayList;
import java.util.List;

public class AddElement {
    public static boolean addNewElement(List<String> list, String str) {
    List<String> check = new ArrayList<>(list);
    check.add(str);
    return list.size() != check.size();
    }
}
