package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        if (number % 2 == 0 && number % 3 == 0) {
            rsl = "The original number is divisible by 6.";
        } else if (number % 3 == 0) {
            rsl = "The original number is divisible by 3, but is not even.";
        } else if (number % 2 == 0) {
            rsl = "The original number is not divisible by 3, but is even.";
        } else {
            rsl = "The original number is not divisible by 3 and is not even.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(DivideBySix.checkNumber(9));
        System.out.println(DivideBySix.checkNumber(11));
        System.out.println(DivideBySix.checkNumber(18));
    }
}
