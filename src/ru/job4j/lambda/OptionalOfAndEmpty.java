package ru.job4j.lambda;

import java.util.List;
import java.util.Optional;

/**
 * Самой неприятной ошибкой при написании программ является NullPointerException.
 * Вроде кажется все должно работать, а где-то забыли сделать проверку и все, программа выдает ошибку.
 * Во избежании подобных ситуаций, разработчики JDK решили добавить класс Optional. Это класс обертка над значением.
 * Как это спасает ситуацию? Дело в том, что напрямую Optional, в некоторых местах использовать не получиться,
   допустим у вас есть хранилище User, вам важно хранить самих User, а не Optional, но например,
   при добавлении если у вас есть Optional, заставит вас задуматься о проверке, прежде чем добавить значение.
 * В Optional есть два метода of() и empty(), первый принимает значение и возвращает Optional из этого значения.
 * Второй возвращает пустой Optional, что значит значения в нем нет.
 * Optional<Integer> num1 = Optional.of(1);     // внутри храниться значение 1
 * Optional<Integer> num2 = Optional.empty();   // внутри ничего не хранится
 * Ваша задача написать метод поиска строки среди списка строк.
 * Если значение найдено, то нужно вернуть Optional из этого значения, в противном случае вернуть пустой Optional.
 */

public class OptionalOfAndEmpty {
    public static Optional<String> findValue(List<String> strings, String value) {
        return strings.contains(value) ? Optional.of(value) : Optional.empty();
    }
}
/*        Optional<String> str = Optional.empty();
        for (String st : strings) {
            if (st.equals(value)) {
               str = Optional.of(st);
            }
        }
        return str;
    }
}*/
