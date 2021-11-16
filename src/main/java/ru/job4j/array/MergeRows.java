package ru.job4j.array;

public class MergeRows {
    public static int[] merge(int[][] data) {
        int[] array = new int[data.length * data.length];
        int index = 0;
        for (int[] datum : data) {
            for (int i : datum) {
                array[index] = i;
                index++;
            }
        }
        return array;
    }
}

//  Второе решение после подсказки про foreache:
// (выше решение уже с применением forache)
/*
    public static int[] merge(int[][] data) {
        int[] array = new int[data.length * data.length];
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++)  {
                array[index++] = data[i][j];
            }
        }
        return array;
    }
}*/


// Первое решение
/*
        int[] array = new int[data.length * data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                int temp = data[i][j];
                data[i][j] = array[i * data.length + j];
                array[i * data.length + j] = temp;
            }

        }
        return array;
    }
}*/
