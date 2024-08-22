package com.Apnikaksha.String;

import java.util.Arrays;

public class LongestCommonPrefix {
    // public static String pre = "";

    public static String commomPreFix(String[] str) {
        // int size = str.length;

        // if size = 0, return empty String
        if (str.length == 0) {
            return "";
        }
        if (str.length == 1) {
            return str[0];
        }

        // sort the Array of String
        Arrays.sort(str);

        // find the minimum length from first a nd last String
        int end = Math.min(str[0].length(), str[str.length - 1].length());

        // find the commom prefix b/w the First and Last String
        int i = 0;
        while (i < end && str[0].charAt(i) == str[str.length - 1].charAt(i)) {
            i++;
        }
        String pre = str[0].substring(0, i);
        return pre;
    }

    public static void main(String[] args) {
        String[] str = { "geekforgeek", "geeks", "geezer" };
        System.out.println(commomPreFix(str));
    }

}
