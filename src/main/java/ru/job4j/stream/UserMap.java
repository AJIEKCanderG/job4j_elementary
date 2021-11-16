package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 5.3. Промежуточные операции. Метод map(). Map с объектами
 * Дан список возрастов.
 * Вам нужно создать список пользователей с такими возрастами
 */

public class UserMap {

    public static class User {

        private int age;

        public User(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }
    }

    public static List<User> map(List<Integer> ages) {
        return ages.stream()
                .map(User::new)
                .collect(Collectors.toList());
    }
}