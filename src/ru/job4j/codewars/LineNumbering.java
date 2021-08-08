package ru.job4j.codewars;

import java.util.List;

/**
 * Your team is writing a fancy new text editor and you've been tasked with implementing the line numbering.
 * Write a function which takes a list of strings and returns each line prepended by the correct number.
 * The numbering starts at 1. The format is n: string. Notice the colon and space in between.
 * Examples:
 * number(Arrays.asList()) # => []
 * number(Arrays.asList("a", "b", "c")) // => ["1: a", "2: b", "3: c"]
 */

public class LineNumbering {
    public static List<String> number(List<String> lines) {
       for (int i = 0; i < lines.size(); i++) {
            lines.set(i, i + 1 + ": " + lines.get(i));
        }
        return lines;
    }
}
