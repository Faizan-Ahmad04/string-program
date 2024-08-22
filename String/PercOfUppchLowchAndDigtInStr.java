package com.Apnikaksha.String;

import java.util.Scanner;

public class PercOfUppchLowchAndDigtInStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int lCount = 0, uCount = 0, sCount = 0, spaceCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 32) {
                spaceCount++;
            } else if (ch >= 97 && ch <= 122) {
                lCount++;
            } else if (ch >= 65 && ch <= 90) {
                uCount++;
            } else {
                sCount++;
            }
        }

        float percentageOfLowerChar = lCount * 100 / str.length();
        float percentageOfUpperrChar = uCount * 100 / str.length();
        float percentageOfSpecialChar = sCount * 100 / str.length();
        float percentageOfSpaceChar = spaceCount * 100 / str.length();

        System.out.println("Percentage of lower character in sting is = " + percentageOfLowerChar + "\n" +
                "Percentage of upper character in sting is = " + percentageOfUpperrChar + "\n" +
                "Percentage of special character in sting is = " + percentageOfSpecialChar + "\n" +
                "Percentage of space character in sting is = " + percentageOfSpaceChar);

        sc.close();
    }

}
