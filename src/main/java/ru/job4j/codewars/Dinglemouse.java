package ru.job4j.codewars;

/**
 * Разделить строку на массив строк по разделителю точка(.), при этом пустые элементы сохранить.
 * Если входная строка пустая, то вернуть массив длиной 1.
 * @author Ajiekcander
 */
public class Dinglemouse {
    public static String[] split(final String joint) {
        return joint.length() == 0 ? new String[]{} : joint.split("\\.", -1);
    }

}
