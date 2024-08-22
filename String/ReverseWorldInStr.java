package com.Apnikaksha.String;

import java.util.*;

public class ReverseWorldInStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        // String[] strArray = str.split("\\s");

        // for (int i = 0; i <= strArray.length / 2; i++) {
        // String temp = strArray[i];
        // strArray[i] = strArray[strArray.length - 1 - i];
        // strArray[strArray.length - 1 - i] = temp;
        // }

        // for (String elements : strArray) {
        // System.out.print(elements + " ");
        // }

        String newStr = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 32) {
                count++;
            }
        }

        String[] arr = new String[count + 1];
        int j = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 32) {
                j++;
                newStr = "";
                continue;
            } else {
                newStr = newStr + str.charAt(i);
                // arr[j] = arr[j] + str.charAt(i);
                arr[j] = newStr;
            }
        }
        System.out.println(j);

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        sc.close();

    }

}
