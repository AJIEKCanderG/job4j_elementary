package ru.job4j.stream;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/** 8.2. Промежуточные операции. Метод distinct(). Уникальные объекты.
 * Если мы используем метод distinct() для объектов, то нужно понимать, что этот метод использует
 * метод equals для проверки равенства объектов.
 * Поэтому если вы хотите исключить дубликаты-объекты, нужно, чтобы в классе был переопределен метод equals
 * Например для класса String метод equals переопределен, поэтому мы можем сделать так
 * List.of("a", "b", "c", "a", "b").stream().distinct() получим стрим из "a", "b", "c"
 * Ваша задача получить список уникальных пользователей.
 * На то, что переопределен методы hashcode не стоит обращать внимание, он переопределен,
 * т.к. это нужно делать при переопределении equals.
 *
 */

public class DistinctForObject {

    public static class User {

        private final String name;
        private final int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            User user = (User) o;
            return age == user.age
                    && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }

    public static List<User> distinct(List<User> users) {
        return users.stream()
                .distinct()
                .collect(Collectors.toList());
    }

}
