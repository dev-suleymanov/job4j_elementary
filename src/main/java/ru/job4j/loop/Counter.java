package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum += i % 2 == 0 ? i : 0;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 9));
        System.out.println(sum(1, 1));
        System.out.println(sum(10, 20));
        System.out.println(sum(5, 6));
        System.out.println(sum(135, 267));
        System.out.println(sumByEven(2, 6));
        System.out.println(sumByEven(10, 14));
    }
}
