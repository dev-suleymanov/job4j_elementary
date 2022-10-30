package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (second > first && second > third) {
            result = second;
        }
        if (third > result) {
            result = third;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(max(0, 11, 15));
        System.out.println(max(12, 25, 25));
        System.out.println(max(-25, 14, 32));
    }
}
