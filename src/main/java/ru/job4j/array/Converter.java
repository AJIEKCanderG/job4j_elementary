package ru.job4j.array;
/**
 * Метод принимает двумерный массив у которого число рядов и число элементов в ряду не совпадают,
 * также количество элементов в каждом ряду может быть абсолютно произвольным.
 * Вам необходимо реализовать метод так, чтобы на выходе получился двумерный квадратный массив.
 * При этом размерность выходного массива должна рассчитываться.
 * Если для полного заполнения выходного массива в исходном массиве не хватает элементов - необходимо дополнить массив 0.
 * Например:
 * Исходный массив {{1}, {2, 3, 4}} - должно получиться {{1, 2}, {3, 4}}
 * Исходный массив {{1}, {2, 3, 4}, {5, 6}} - должно получиться {{1, 2, 3}, {4, 5, 6}, {0, 0, 0}}
 */

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int sum = 0;
        for (int[] ints : array) {
            sum += ints.length;
        }
        int n = (int) Math.ceil(Math.sqrt(sum));
        int k = 0;
        int m = 0;
        int[][] result = new int[n][n];
        for (int[] ints : array) {
            for (int anInt : ints) {
                result[m][k] = anInt;
                if (k++ == result.length - 1) {
                    k = 0;
                    m++;
                }
            }
        }
        return result;
    }
}

/* Решение №2 через одномерный массив */
/*       int[] rsl = new int[sum];
         for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (k < rsl.length) {
                    rsl[k++] = array[i][j];
                }
            }
        }
       for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (m < rsl.length) {
                    result[i][j] = rsl[m++];
                }
            }
        }

 */
