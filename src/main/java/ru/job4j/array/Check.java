package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = data[0];
        for (int i = 0; i < data.length; i++) {
            result = result == data[i];
        }
        return result;
    }
}