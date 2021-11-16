package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (min > i) {
                min = i;
            }
            /* проверить, что эталон больше, чем элемент. записать в эталон элемент массива. */
        }
        return min;
    }
}


//     int min = array[0];
//     for (int j = 0; j < array.length; j++) {
//     int i = array[j];
//     if (min > i) {
//     min = i;
//     }
//  }
//     return min;
//  }
//}
