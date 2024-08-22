package com.Apnikaksha.String;

public class RandomStr {
    public static void main(String[] args) {
        // Given input string
        String inputString = "The big dog jumped over cat";

        // Splitting the input string into an array of words
        String[] words = inputString.split(" ");

        // Reversing each word in the array
        for (int i = 0; i < words.length; i++) {
            StringBuilder reversedWord = new StringBuilder(words[i]);
            words[i] = reversedWord.reverse().toString();
        }

        // Reversing the order of words in the array
        for (int i = 0; i < words.length / 2; i++) {
            String temp = words[i];
            words[i] = words[words.length - i - 1];
            words[words.length - i - 1] = temp;
        }

        // Joining the reversed words to form the final output string
        String outputString = String.join(" ", words);

        // Printing the final output
        System.out.println(outputString);
    }
}
