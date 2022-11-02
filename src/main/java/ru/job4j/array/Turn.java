package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int[] arrayRevers = new int[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++) {
            arrayRevers[i] = array[j--];
        }
        return arrayRevers;
    }
}
