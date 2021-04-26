package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

/**  9.5. Optional и Stream. Метод stream()
 * Ваша задача найти тел. номера пользователя с заданным id, которые начинаются с region
 */

public class OptionalStream {

    public static class PhoneNumber {

        private final String phone;

        public PhoneNumber(String phone) {
            this.phone = phone;
        }

        public String getPhone() {
            return phone;
        }
    }

    public static class User {

        private final int id;
        private final List<PhoneNumber> numbers;

        public User(int id, List<PhoneNumber> numbers) {
            this.id = id;
            this.numbers = numbers;
        }

        public int getId() {
            return id;
        }

        public List<PhoneNumber> getNumbers() {
            return numbers;
        }
    }

    public static List<PhoneNumber> collectNumber(List<User> users, int id, String region) {
        return users.stream()
                .filter(i -> i.getId() == id)
                .findFirst()
                .stream()
                .flatMap(n -> n.getNumbers().stream())
                .filter(phoneNumber -> phoneNumber.getPhone().startsWith(region))
                .collect(Collectors.toList());
    }
}
