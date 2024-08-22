package com.Apnikaksha.String;

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        // String newStr[] = str.split(" ");

        // for (int i = 0; i < newStr.length / 2; i++) {
        // String temp = newStr[i];
        // newStr[i] = newStr[newStr.length - 1 - i];
        // newStr[newStr.length - 1 - i] = temp;
        // }

        // for (int i = 0; i < newStr.length; i++) {
        // System.out.print(newStr[i] + " ");
        // }
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length / 2; i++) {
            char newCh = ch[i];
            ch[i] = ch[ch.length - 1 - i];
            ch[ch.length - 1 - i] = newCh;
        }

        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
        sc.close();
    }
}
