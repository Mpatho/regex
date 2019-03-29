package com.psybergate.learning.core.regex.exercise;

import com.psybergate.learning.core.regex.common.Exercise;

/**
 * print all the numbers greeter than or equal a million.
 */
public class QuantifiersExercise implements Exercise {
    public static void main(String[] args) {
        String a = "[1-9][0-9]{6,}";
        String b = "\\d{7}";
        String c = "[0-9]{7}";
    }
}
