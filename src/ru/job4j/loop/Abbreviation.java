package ru.job4j.loop;

public class Abbreviation {
    public static String collect(String s) {
        StringBuilder firstLetters = new StringBuilder();
        s = s.replaceAll("", "");
        for (String str : s.split(" ")) {
            firstLetters.append(str.charAt(0));
        }
        return firstLetters.toString();

    }
}

/*Аббревиатуры стали неотъемлемой частью нашей жизни.
Мы очень часто используем и много какие выражения сокращаем,
забирая от каждого слова только первую букву - именно так формируются аббревиатуры.
Метод принимает строку, которая состоит из нескольких слов каждое из которых
начинается с прописной буквы. Необходимо из полученной строки сформировать аббревиатуру.
Для формирования новой строки используйте StringBuilder и его метод append().*/