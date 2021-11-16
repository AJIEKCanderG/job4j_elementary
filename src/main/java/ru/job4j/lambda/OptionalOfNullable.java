package ru.job4j.lambda;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Чтобы создать Optional в случае если есть null элементы можно использовать метод Optional.ofNullable().
 * Этот метод возвращает пустой Optional если передано null значение и Optional из переданного значения, если оно не null.
 * Например,
 * Optional.ofNullable(1).ifPresent(System.out::println); выведет 1
 * Optional.ofNullable(null).ifPresent(System.out::println); ничего выведется, потому что мы получили пустой Optional
 * Ваша задача, написать метод поиск строки среди списка.
 * В списке могут быть null элементы. Чтобы обернуть найденное значение нужно использовать Optional.ofNullable().
 * Для безопасной проверки можно использовать Objects.equals(). Если что-то найдено, нужно вернуть Optional из этого значения, в противном случае пустой Optional
 */

public class OptionalOfNullable {
    public static Optional<String> findValue(List<String> strings, String value) {
        for (String s : strings) {
            if (Objects.equals(s, value)) {
                return Optional.ofNullable(s);
            }
        }
        return Optional.empty();
    }
}