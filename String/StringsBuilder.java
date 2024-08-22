
package com.Apnikaksha.String;

public class StringsBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("lol"); // create stringbuilder!
        System.out.println(sb.equals(sb.reverse()));
        System.out.println(sb);

        // charAt() method index 0!
        System.out.println(sb.charAt(0));

        // SetcharAt(index,char) method at index 0,replace any character by another
        // character
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        // Insert any character in string at any position using insert(index,char)
        sb.insert(0, 's');
        System.out.println(sb);
        sb.insert(3, 'l');
        System.out.println(sb);

        // delet(st index, end index(not include)), used to delet a character or
        // subString in a string
        sb.delete(2, 3);
        System.out.println(sb);

        sb.delete(3, 6);
        System.out.println(sb);

        // append() method use to add something end of stringBuilder
        StringBuilder sbp = new StringBuilder("h");
        sbp.append('e');
        sbp.append('l');
        sbp.append('l');
        sbp.append('o');
        System.out.println(sbp);

        // Reverse StringBuilder !
        for (int i = 0; i < sbp.length() / 2; i++) {
            int front = i;
            int back = sbp.length() - 1 - i;

            char frontChar = sbp.charAt(front);
            char backChar = sbp.charAt(back);

            sbp.setCharAt(front, backChar);
            sbp.setCharAt(back, frontChar);
            // System.out.println(sb);
        }

        System.out.println(sbp);
    }
}
