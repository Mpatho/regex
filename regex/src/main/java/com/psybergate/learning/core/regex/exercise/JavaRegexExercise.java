package com.psybergate.learning.core.regex.exercise;

import com.psybergate.learning.core.regex.common.Exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * count how many time character 'e' appears in any given string, ignore the case.
 */
public class JavaRegexExercise {


    public static void main(String[] args) {
            Pattern e = Pattern.compile("e");
            int count = 0;
            String text = "d;fdeaelkdfe";
            Matcher matcher = e.matcher(text);
            while (matcher.find()) {
                count++;
            }
            System.out.println(count);
        }
}
