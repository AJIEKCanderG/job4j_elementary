package ru.job4j.stream;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StudentToMapTest {

    @Test
    public void whenConvert() {
        StudentToMap studentToMap = new  StudentToMap();
        Student st1 = new Student(40, "Ivanov");
        Student st2 = new Student(10, "Petrov");
        Student st3 = new Student(33, "Sidorov");
        Map<String, Student> result = studentToMap.convert(List.of(st1, st2, st3));
        Map<String, Student> expected = Map.of(
                "Ivanov", st1,
                "Petrov", st2,
                "Sidorov", st3
        );
        assertThat(result, is(expected));
    }

    @Test
    public void whenConvertAndDeletedCopy() {
        StudentToMap studentToMap = new  StudentToMap();
        Student st1 = new Student(40, "Ivanov");
        Student st2 = new Student(33, "Sidorov");
        Student st3 = new Student(10, "Petrov");
        Student st4 = new Student(40, "Ivanov");
        Map<String, Student> result = studentToMap.convert(List.of(st1, st2, st3, st4));
        Map<String, Student> expected = Map.of(
                "Ivanov", st1,
                "Sidorov", st2,
                "Petrov", st3
        );
        assertThat(result, is(expected));
    }
}