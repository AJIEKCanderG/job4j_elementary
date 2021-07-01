package ru.job4j.lambda;

import java.util.List;
import java.util.Optional;

/**
 * 5.6. Optional. Методы orElseThrow()
 * Еще одной частой задачей бывает валидация данных, т.е. действия вида: если проверка прошла,
 * то выкинуть исключение, иначе продолжить работать дальше. Опять же относительно Optional мы могли бы написать,
 * если Optional пустой, то выкинуть исключение. На этот случай в Optional также есть метод orElseThrow(),
 * этот метод перегружен. Метод работает так, если значение существует, то оно возвращается,
 * иначе вылетает исключение. Метод orElseThrow() который ничего не принимает кидает исключение
 * NoSuchElementException, в перегруженную его версию мы можем отправить любое исключение
 *
 * Например
 * Optional.of(1).orElseThrow(); // исключения не будет, т.к. значение есть
 * Optional.empty().orElseThrow(); // будет исключение NoSuchElementException
 * Optional.empty().orElseThrow(НашеИсключение::new); // будет исключение НашеИсключение
 * Ваша задача написать метод поиска пользователя по логину. Если ничего не найдено, то нужно вернуть исключение
 */

public class OptionalOrElseThrow {

    public static class User {
        private String login;

        public User(String login) {
            this.login = login;
        }

        public String getLogin() {
            return login;
        }
    }

    public static class UserNotFoundException extends RuntimeException { }

    public static User orElseThrow(List<User> list, String login) {
        return search(list, login).orElseThrow(UserNotFoundException::new);
    }

    private static Optional<User> search(List<User> list, String login) {
        Optional<User> user = Optional.empty();
        for (User u: list) {
            if (u.login.equals(login)) {
                return Optional.of(u);
            }
        }
        return user;
    }
}
