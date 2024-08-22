package com.Apnikaksha.String;

public class StringsMethods {
    public static void main(String[] args) {

        // display lengh of String using length() method!
        String str = "Hello java";
        System.out.println(str.length());

        // carAt() method used to display all character one by one!
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        // compare string!

        // case1: st1>st2: +ve
        // case2: st1<st2: -ve
        // case3: st1=st2: 0

        // hello wello differend b/w h and w then w is grater so string wello is grater
        String name1 = "Faizan";
        String name2 = "Faizan";
        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal!");
        } else {
            System.out.println("Strings are not equal!");
        }

        // Substring() method, substring(begning index, end index)!
        String sentance = "how are you";
        String name = sentance.substring(8, sentance.length());
        System.out.println(name);

    }

}
