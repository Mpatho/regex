package com.psybergate.learning.core.regex.exercise;


import com.psybergate.learning.core.regex.common.Exercise;
import com.psybergate.learning.core.regex.util.RegexPrintUtil;

/**
 * print all the word that start and end with the same character in any given string.
 */
public class BackreferenceExercise implements Exercise {
    public static void main(String[] args) {
        String regex = "[^\\w]?(\\w)\\w*\\1[^\\w]?";
        RegexPrintUtil.find(regex, "rr");
    }
}
