package ru.job4j.array;

import java.util.*;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        List<String> list = getDuplicates(input);
        for (String el : list) {
            result += el.charAt(0);
            if (el.length() != 1) {
                result += "" + el.length();
            }
        }
        return result;
    }

    private static List<String> getDuplicates(String input) {
        List<String> list = new ArrayList<>(Arrays.asList(input.split("(?<=(.))(?!\\1)")));
        return list;
    }
}
