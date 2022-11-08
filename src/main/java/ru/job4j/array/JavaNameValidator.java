package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        char[] array = name.toCharArray();
        if (!name.isEmpty() && !Character.isUpperCase(array[0]) && !Character.isDigit(array[0])) {
            for (char el : array) {
                if (Character.isDigit(el) || isSpecialSymbol(el)
                        || isUpperLatinLetter(el) || isLowerLatinLetter(el)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}