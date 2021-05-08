package ru.job4j.array;

/** Упражнения 1.1.6. Массивы 50. Циклический сдвиг вправо
 * Ваша задача выполнить циклический сдвиг вправо с шагом count
 * Например,
 * {1, 2, 3, 4, 5}, count = 1 => {5, 1, 2, 3, 4}
 * {1, 2, 3, 4, 5}, count = 2 => {4, 5, 1, 2, 3}
 */

public class RightShift {
    public static void shift(int[] nums, int count) {
        for (int i = 0; i < count; i++) {
            shift(nums);
        }
    }
    private static void shift(int[] nums) {
        int temp = nums[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[nums.length - 1 - i] = nums[nums.length - 2 - i];
        }
        nums[0] = temp;
    }
}

