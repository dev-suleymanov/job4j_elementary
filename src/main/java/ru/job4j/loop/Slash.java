package ru.job4j.loop;

public class Slash {
    public static void draw(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                boolean left = i == j;
                boolean right = i + j == size - 1;
                if (left || right)  {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        draw(4);
        System.out.println();
        draw(7);
        System.out.println();
        draw(11);
    }
}
