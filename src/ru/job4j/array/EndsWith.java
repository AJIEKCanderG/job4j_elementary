package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        for (int index = 0; index < post.length; index++) {
            return word[word.length - 1] == post[post.length - 1];
        }
        return true;
    }
}