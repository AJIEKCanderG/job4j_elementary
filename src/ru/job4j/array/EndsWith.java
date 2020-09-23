package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            if (post[post.length - i - 1] != word[word.length - i - 1]) {
                return false;
            }
        }
        return result;
    }
}