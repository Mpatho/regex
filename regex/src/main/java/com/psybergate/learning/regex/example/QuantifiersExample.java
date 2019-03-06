package com.psybergate.learning.regex.example;

import com.psybergate.learning.regex.common.BaseExample;

/**
 * A regex quantifier tells the regex engine to match a certain quantity of the character,
 * token or subexpression immediately to its left.
 *
 * X* imply X, zero are more times.
 * X+ imply X, one or more times
 * X? imply X, once or not at all.
 * X{n} imply X, exactly n times
 * X{n,} imply X, at least n times
 * X{n,m} imply X, at least n but not more than m times
 */
public class QuantifiersExample extends BaseExample {

    public void run() {
        String text = "By default, a quantifier tells the engine to match as many instances of its quantified " +
                "token or subpattern as posssible. This behavior is called greedy.";
        find("t+", text);
        find("s*", text);
        find("[aeiou]{1,}", text);
    }
}
