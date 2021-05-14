package ru.job4j.array;

/**
 * 59. Раздвинуть элементы массива
 * В данной задаче вам предстоит реализовать алгоритм сдвига элементов массива.
 * Вы должны написать метод который принимает в качестве параметров двумерный массив(количество рядов должно
 * быть равно количеству строк), массив заполнен случайными числами от 1 до 100,
 * и два индекса
 * индекс строки и индекс колонки.
 * В данную ячейку записывается 0 а все цифры левее, правее, выше и ниже сдвигаются на 1 ячейку
 * Например было
 * {1, 2, 3},
 * {4, 5, 6},
 * {7, 8, 9} и если индексы это 1 и 1 то массив должен иметь вид
 * {1, 5, 3},
 * {5, 0, 5},
 * {7, 5, 9}
 */

public class PushTheNumbers {
    public static void push(int[][] array, int row, int column) {
        for (int i = 0; i < array.length; i++) {
            if (i < row) {
                array[i][column] = array[i + 1][column];
            }
            if (i > row) {
                array[array.length - i + 2][column] = array[array.length - i + 1][column];
            }
            if (i < column) {
                array[row][i] = array[row][i + 1];
            }
            if (i > column && array.length % 2 == 0) {
                array[row][array.length - i + 1] = array[row][array.length - i];
            }
            if (i > column && array.length % 2 != 0) {
                array[row][array.length - i + 2] = array[row][array.length - i + 1];
            }
        }
        array[row][column] = 0;
    }
}