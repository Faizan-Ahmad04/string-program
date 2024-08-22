package com.Apnikaksha.String;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {

        String str1 = "peek";
        String str2 = "KEep";
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");

        boolean isAnagram = true;
        if (str1.length() != str2.length()) {
            isAnagram = false;
        } else {

            char[] charArr1 = str1.toLowerCase().toCharArray();
            char[] charArr2 = str2.toLowerCase().toCharArray();

            Arrays.sort(charArr1);
            Arrays.sort(charArr2);

            isAnagram = Arrays.equals(charArr1, charArr2);
        }

        if (isAnagram) {
            System.out.println("Strings are Anagram");
        } else {
            System.out.println("String are not Anagram");
        }
    }
}
