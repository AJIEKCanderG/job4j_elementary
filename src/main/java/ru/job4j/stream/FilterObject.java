package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 6.3. Промежуточные операции. Метод filter(). Фильтрация объектов
 * Дан список пользователей. Вам нужно оставить только пользователей, у которых имя начинается с буквы "B", а возраст > 18.
 */

public class FilterObject {

    public static class User {

        private final String name;

        private final int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public static List<User> filter(List<User> users) {
        return users.stream()
                .filter(n -> n.getName().startsWith("B"))
                .filter(n -> n.getAge() > 18)
                .collect(Collectors.toList());
    }

}