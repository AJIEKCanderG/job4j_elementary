package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentToMap {
    public Map<String, Student> convert(List<Student> students) {
        return students
                .stream()
                .collect(
                        Collectors.toMap(
                        Student::getSurname,
                        student -> student,
                                (x, y) -> x
        ));
    }
}

