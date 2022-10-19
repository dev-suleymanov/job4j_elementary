package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int x = x2 - x1;
        int y = y2 - y1;
        double rsl = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(1, 6, 3, 12);
        System.out.println("result (1, 6) to (3, 12) " + result);
    }
}