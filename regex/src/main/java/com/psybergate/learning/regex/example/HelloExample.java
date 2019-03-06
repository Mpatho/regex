package com.psybergate.learning.regex.example;

import com.psybergate.learning.regex.common.BaseExample;

/**
 * A regular expression, regex or regexp (sometimes called a rational expression)
 * is a sequence of characters that define a search pattern.
 *
 * Usually this pattern is used by string searching algorithms for "find" or "find and replace" operations on strings,
 * or for input validation.
 *
 * characters '.'` ',' '*' '+' '?' '{' '|' '(' ')' '[' '\' '^' '$' are reserve.
 * whoever you can escape them by using a backslash.
 */
public class HelloExample extends BaseExample {

    public void run() {
        String text = "Hello Regular Εxpression";
        find("Hello", text);
        find("Regular Expression", text);
        find("Regular .xpression", text);
        find("Regular \\u0395xpression", text);
    }
}
