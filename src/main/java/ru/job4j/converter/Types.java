package ru.job4j.converter;

public class Types {
    public static void main(String[] args) {
        long l = 228;
        byte b = (byte) l;
        System.out.println(b);

        float f = 12358.7f;
        int i = 45981;
        short rsl = (short) (f + i);
        System.out.println(rsl);

        char c = 45000;
        float x = c;
        System.out.println(x);

        double d = 121.19;
        byte y = (byte) d;
        System.out.println(y);

        short s = 1500;
        char j = (char) s;
        double q = j;
        System.out.println(q);
    }
}
