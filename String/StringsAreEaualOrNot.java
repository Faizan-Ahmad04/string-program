package com.Apnikaksha.String;

import java.util.*;

public class StringsAreEaualOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // check equality using string literal!
        String str1 = "Hello Java";
        String str2 = "Hello Java";
        System.out.println(str1 == str2); // it disply true because both referance point same object "Hello Java" !

        // same string check using new keyword!
        String s1 = new String("Learn java");
        String s2 = new String("Learn java");
        System.out.println(s1 == s2); /*
                                       * it display false although both strings are same because s1 & s2 are
                                       * two different object!
                                       */
        // Always use "equal() method to compare two strings! "
        System.out.println(s1.equals(s2)); // it display true

        // Take String User Input & Read!
        System.out.println("Enter String: ");
        // using next() method!
        String st1 = sc.next();// reade the input before the space id found, retains cursor in the same line
        System.out.println(st1);

        // Using nextLine() method!
        System.out.println("Enter string");
        String st2 = sc.nextLine(); // This code is not Execute "next()" method not move cursor in next line after
                                    // reading input, & "nextLine()" method reads the text until the end of line and
                                    // throw the cursor next line
        System.out.println(st2);

        // Cncatination String!
        String firstName = "Faizan";
        String lastName = "Ahmad";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        fullName = firstName + "&" + lastName;
        System.out.println(fullName);
        sc.close();

    }
}
