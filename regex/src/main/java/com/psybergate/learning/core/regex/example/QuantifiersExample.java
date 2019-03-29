package com.psybergate.learning.core.regex.example;

import com.psybergate.learning.core.regex.common.Example;
import com.psybergate.learning.core.regex.util.RegexPrintUtil;

/**
 * A regex quantifier tells the regex engine to match a certain quantity of the character,
 * token or subexpression immediately to its left.
 * <p>
 * X* imply X, zero are more times.
 * X+ imply X, one or more times
 * X? imply X, once or not at all.
 * X{n} imply X, exactly n times
 * X{n,} imply X, at least n times
 * X{n,m} imply X, at least n but not more than m times
 */
public class QuantifiersExample implements Example {

    public static void main(String[] args) {
        String text = "By default, a quantifier tells the engine to match as many instances of its quantified " +
                "token or subpattern as possible. This behavior is called greedy. \n ";
//        RegexPrintUtil.find("quantif.{1,4} ", text); // Greedy
//        RegexPrintUtil.find("quantif.{1,4}? ", text); // Reluctant
//        RegexPrintUtil.find("quantif.{1,4}+ ", text); // Possessive
//        RegexPrintUtil.find("quantif.+ ", text); // Greedy
//        RegexPrintUtil.find("quantif.+? ", text); // Reluctant
        RegexPrintUtil.find("quantif\\w++ ", text); // Possessive
    }
}
