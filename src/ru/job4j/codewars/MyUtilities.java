package ru.job4j.codewars;

/** Is it a number?
 * Given a string s, write a method (function) that will return true if its a valid single integer or floating number
 * or false if its not.
 * Valid examples, should return true:
 * isDigit("3")
 * isDigit("  3  ")
 * isDigit("-3.23")
 * should return false:
 * isDigit("3-4")
 * isDigit("  3   5")
 * isDigit("3 5")
 * isDigit("zero")
 */

public class MyUtilities {
    public boolean isDigit(String s) {
        if (s.length() == 0) {
            return false;
        }
        s = s.trim();
        char[] ch = s.toCharArray();
        for (int i = 1; i < ch.length; i++) {
            if (ch[i] == '.') {
                return true;
            }
            if (Character.isLetter(ch[0]) || Character.isLetter(ch[i]) || Character.isWhitespace(ch[i]) || ch[i] == '-') {
                return false;
            }
        }
        return true;
    }
}

/*
 try {
      Double.parseDouble(s);
      return true;
    } catch(Exception e) {
      return false;
    }
  }
}
 */