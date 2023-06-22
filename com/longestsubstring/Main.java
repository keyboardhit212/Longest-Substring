package com.longestsubstring;

import java.util.Scanner;

public class Main {

    private static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a word: ");
        String word = console.nextLine();
        String longestSubstring = new LongestSubstring(word).getString();
        System.out.println("The longest substring w/o repeating characters is: " + longestSubstring);
    }
}