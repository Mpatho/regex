package com.psybergate.learning.regex.example;

/**
 * A regular expression, regex or regexp (sometimes called a rational expression) is a sequence of characters that define a search pattern.
 * Usually this pattern is used by string searching algorithms for "find" or "find and replace" operations on strings, or for input validation.
 */
public class HelloRegex extends BaseRegex {

    private final String text = "Hello Regex, hoping this will be funny.";

    public static void main(String[] args) {
        HelloRegex helloRegex = new HelloRegex();
        helloRegex.runContains();
        helloRegex.runFindAll();

    }

    public void runContains() {
        System.out.println(contains("Hello Regex", text));
        System.out.println(contains("Hello Regexp", text));
        System.out.println(contains("Hello Rege", text));
    }

    public void runFindAll() {
        printAll(findAll("[a-zA-z]e", text));
    }
}
