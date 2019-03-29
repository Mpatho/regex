package com.psybergate.learning.core.regex.example;

import com.psybergate.learning.core.regex.common.Example;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A regular expression, regex or regexp (sometimes called a rational expression)
 * is a sequence of characters that define a search pattern.
 * <p>
 * Usually this pattern is used by string searching algorithms for "find" or "find and replace" operations on strings,
 * or for input validation.
 * <p>
 * By default in java regex are case sensitive
 */
public class JavaRegexExample implements Example {

    public static void main(String[] args) {
        String text = "Hello Regex 101.";
        Pattern pattern = Pattern.compile("e", Pattern.CASE_INSENSITIVE);

        Predicate patternPredicate = pattern.asPredicate();
        System.out.println(patternPredicate.test(text)); // test if text matches the pattern.

        System.out.println(Arrays.toString(pattern.split(text))); // split text with the pattern.

        Matcher matcher = pattern.matcher(text); // just constructing a matcher!!
        if (matcher.find()) {
            MatchResult matchResult = matcher.toMatchResult();
            System.out.println(matchResult.group());
        }

    }
}
