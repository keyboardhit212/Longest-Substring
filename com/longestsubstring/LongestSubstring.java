package com.longestsubstring;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstring {

    private String word;
    private List<String> substrings;

    public LongestSubstring(String word) {
        this.word = word;
        this.substrings = new ArrayList<>();
        initialize();
    }

    public String getString() {
        return getLongest();
    }

    @Override
    public String toString() {
        return getLongest();
    }

    private void initialize() {
        StringBuilder temporaryHolder = new StringBuilder();
        for (int i = 0; i < this.word.length(); i++) {
            String character = String.valueOf(this.word.charAt(i));
            if (!temporaryHolder.toString().contains(character)) {
                temporaryHolder.append(character);
            } else {
                this.substrings.add(temporaryHolder.toString());
                temporaryHolder = new StringBuilder();
                temporaryHolder.append(character);
            }
        }
    }

    private String getLongest() {
        String comparison = new String();
        for (String word : substrings) {
            if (word.length() > comparison.length()) {
                comparison = word;
            }
        }
        return comparison;
    }


}
