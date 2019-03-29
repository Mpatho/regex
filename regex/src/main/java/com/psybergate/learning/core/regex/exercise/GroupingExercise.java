package com.psybergate.learning.core.regex.exercise;


import com.psybergate.learning.core.regex.common.Exercise;
import com.psybergate.learning.core.regex.util.RegexPrintUtil;

/**
 * print all the characters,
 * excluding the whitespace that follows a vowel in any given text.
 */
public class GroupingExercise implements Exercise {
    public static void main(String[] args) {
        String a = "(?:a|e|i|o|u)(\\S+)";
        RegexPrintUtil.findGroups(a, "print all the characters,");
    }
}
