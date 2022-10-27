package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int result = Max.max(15, 4);
        System.out.println("Is Max number = " + result);
        result = Max.max(2, 7);
        System.out.println("Is Max number = " + result);
    }
}
