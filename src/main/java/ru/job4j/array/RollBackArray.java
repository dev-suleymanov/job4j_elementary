package ru.job4j.array;

public class RollBackArray {
    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0, j = 0; i < array.length; i++) {
            j = array[array.length - i - 1];
            result[i] = j;
        }
        return result;
    }
}