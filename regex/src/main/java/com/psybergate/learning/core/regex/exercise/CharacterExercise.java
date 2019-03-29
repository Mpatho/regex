package com.psybergate.learning.core.regex.exercise;


import com.psybergate.learning.core.regex.common.Exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * print all the sequence of characters in a word,
 * of length two and starting with 'e' in any given string.
 */
public class CharacterExercise implements Exercise {
    public static void main(String[] args) {
        String text = "Hey people.";
        Pattern pattern = Pattern.compile("e.");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
