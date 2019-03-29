package com.psybergate.learning.core.regex.example;

import com.psybergate.learning.core.regex.common.Example;
import com.psybergate.learning.core.regex.util.RegexPrintUtil;


/**
 * By placing part of a regular expression inside round brackets or parentheses, you can group that part of the regular expression together.
 * This allows you to apply a quantifier to the entire group or to restrict alternation to part of the regex.
 */
public class GroupingExample implements Example {
    public static void main(String[] args) {
        String text = "ftp://www.regular-expressions.info/brackets.html";
//        RegexPrintUtil.findGroups("(https|http|ftp)://(.+)/(.*)?", text);
        RegexPrintUtil.findGroups("(?:https|http|ftp)://(.+)/(.*)?", text);
    }
}
