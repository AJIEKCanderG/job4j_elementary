package ru.job4j.codewars.strings;

public class StringBestPractic {
    public static void main(String[] args) {

        String video = "video_0.mp4";
        String gif = video.split("\\.")[0] + ".gif";
        System.out.println(gif);

        /**
         *  Проверка, что строка это число с помощью regex
         */
        String s = "123";
        System.out.println(s.matches("[0-9]"));
        System.out.println(s.matches("\\d"));

        /**
         * Проверка, что строка содержит от 4 до 16 символов:
         * строчных букв
         * нижнее подчеркивание
         * цифры
         */
        String str = "abcd haf";
        System.out.println(str.matches("[0-9\\d]"));

        /**
         *  Из массива строк создать предложение со словами через пробел.
         *  ['hello', 'world', 'this', 'is', 'great']  =>  'hello world this is great'
         */
        String[] words = {"hello", "world", "this", "is", "great"};
        String x = String.join(" ", words);
        System.out.println(x);

        /**
         *  Соединие строк через запятуюю
         */
        String[] arr = {"Cheese", "Milk", "Chocolate"};
        System.out.println("I like " + String.join(", ", arr) + "!");
        System.out.printf("I like %s!%n", String.join(", ", arr));

        /**
         *  Создайте функцию, которая принимает строку и целое число (n).
         *  Функция должна возвращать строку, которая повторяет входную строку n раз.
         *  Если передается что-либо, кроме строки, вы должны вернуть «Not a string»
         *  instanceof нужен, чтобы проверить, был ли объект, на который ссылается переменная X,
         *  создан на основе какого-либо класса Y
         */
        int n = 5;
        Object toRepeat = "New String";
        if (!(toRepeat instanceof String)) {
            System.out.println("Not a string");
        }
        System.out.println(String.valueOf(toRepeat).repeat(n));

        /**
         * Реверс строки
         */
        String string = "abcde";
        System.out.println(new StringBuilder(string).reverse());

    }
}
