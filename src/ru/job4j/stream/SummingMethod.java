package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 2.3. Группировка элементов и сумма. Метод summigtInt()
 * Если нам нужно подсчитать сумму элементов при группировке, то можем использовать
 * коллектор Collectors.summingInt(), этот коллектор суммирует в int.
 * Он принимает функцию в которой мы должны преобразовать наш объект к int
 *
 * Например, просуммируем четные и нечетные элементы.
 * В примере summingInt принимает n -> n, т.к. в списке уже хранятся числа

 * Вам дан список пользователей, у каждого пользователя есть счет. Ваша задача найти сумму баланса для каждого пользователя.
 * Подсказка: нужно использовать вспомогательный класс для группировки Pair
 */

public class SummingMethod {

    public static class User {

        private final String name;

        private final List<Bill> bills;

        public User(String name, List<Bill> bills) {
            this.name = name;
            this.bills = bills;
        }

        public String getName() {
            return name;
        }

        public List<Bill> getBills() {
            return bills;
        }
    }

    public static class Bill {

        private final int balance;

        public Bill(int balance) {
            this.balance = balance;
        }

        public int getBalance() {
            return balance;
        }
    }

    private static class Pair {
        private final User user;
        private final Bill bill;

        public Pair(User user, Bill bill) {
            this.user = user;
            this.bill = bill;
        }

        public User getUser() {
            return user;
        }

        public Bill getBill() {
            return bill;
        }
    }

    public static Map<String, Integer> summing(List<User> users) {
       return users.stream()
               .map(user -> user.getBills()
                       .stream()
                       .map(bill -> new Pair(user, bill))
                       .collect(Collectors.toList()))
               .flatMap(List::stream)
                       .collect(Collectors.groupingBy(pair -> pair.getUser().getName(),
                        Collectors.summingInt(value -> value.getBill().getBalance())));
    }

}
