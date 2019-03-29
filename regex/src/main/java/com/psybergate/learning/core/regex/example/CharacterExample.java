package com.psybergate.learning.core.regex.example;

import com.psybergate.learning.core.regex.common.Example;
import com.psybergate.learning.core.regex.util.RegexPrintUtil;

/**
 * characters '.'` ',' '*' '+' '?' '{' '|' '(' ')' '[' '\' '^' '$' are reserve.
 * whoever you can escape them by using a backslash, in java use \\
 *
 *    Predefined character classes
 * . Any character.
 */
public class CharacterExample implements Example {

    public static void main(String[] args) {
        String text = "Hello Regular \nxpression";
//        RegexPrintUtil.find("Hello", text); // find the literal string 'Hello'.
//        RegexPrintUtil.find("hello", text); // find the literal string 'hello'. is it case sensitive
//        RegexPrintUtil.find("Regular .xpression", text); // find the literal Xxpression were X is any character.
//        RegexPrintUtil.find("Regular \\.xpression", text); // find the literal .xpression
//        RegexPrintUtil.find("Regular \\u0045xpression", text); // fine the literal Expression using unicode.
        RegexPrintUtil.find("Regular \\nxpression", text); // fine the literal Expression using unicode.
    }
}
