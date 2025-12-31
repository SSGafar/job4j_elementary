package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        if (array == null || array.length < 2) {
            return new int[0];
        }
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int summa = array[left] + array[right];
            if (summa == target) {
                return new int[]{left, right};
            } else if (summa < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }
}
