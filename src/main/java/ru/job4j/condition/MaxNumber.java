package ru.job4j.condition;

public class MaxNumber {
    public static void main(String[] args) {
        int result = MaxNumber.getMaxNumber(14, 17, 22);
        System.out.println(result);
    }

    public static int getMaxNumber(int a, int b, int c) {
        int result = 0;
        if (a > b) {
            if (a > c) {
                result = a;
            } else {
                result = c;
            }
        } else {
            if (b > c) {
                result = b;
            } else {
                result = c;
            }
        }
        return result;
    }
}
