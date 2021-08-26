package ru.job4j.codewars;

public class BinarySearch {
    public static Object searchIntInArray(int[] array, int number) {
        int low = 0;
        int mid;
        int high = array.length - 1;
        while(low <= high) {
            mid = low + high;
            int guess = array[mid];
            if(guess == number) {
                return mid;
            }
            if (guess > number) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return "Number was not found";
    }

    public static void main(String[] args) {

    }
}
