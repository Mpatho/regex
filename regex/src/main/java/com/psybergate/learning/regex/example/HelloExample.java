package com.psybergate.learning.regex.example;

import com.psybergate.learning.regex.common.BaseExample;

/**
 * A regular expression, regex or regexp (sometimes called a rational expression) is a sequence of characters that define a search pattern.
 * Usually this pattern is used by string searching algorithms for "find" or "find and replace" operations on strings, or for input validation.
 */
public class HelloExample extends BaseExample {

    private final String text = "Hello Regex, hoping this will be funny.";

    public void runContains() {
        printContains(contains("Hello Regex", text));
        printContains(contains("Hello Regexp", text));
        printContains(contains("Hello Rege", text));
    }

    public void runFindAll() {
        printAll(findAll("[a-zA-z]e", text));
    }
}
