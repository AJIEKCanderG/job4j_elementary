package ru.job4j.collection;

import org.junit.Test;
import ru.job4j.collection.AddElement;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AddElementTest {
    @Test
    public void addNewElement() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        boolean result = AddElement.addNewElement(list, "fourth");
        assertThat(result, is(true));
    }
}