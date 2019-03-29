package com.psybergate.learning.core.regex.example;

import com.psybergate.learning.core.regex.common.Example;
import com.psybergate.learning.core.regex.util.RegexPrintUtil;


/**
 * [abc] imply a, b, or c
 * [^abc] imply any character except a, b, or c
 * [a-z] imply a, z, or any character that come after a and before z
 * [a-m[n-z]] imply union of [a-m] and [n-z] same as [a-mn-z]
 * [a-y&&[wxyz]] imply intersection of [a-y] and [wxyz] same as [wxy]
 */
public class CharacterClassExample implements Example {

    public static void main(String[] args) {
        String text = "The character class is the most basic  concept after a literal find. " +
                "It makes one small sequence of characters find a larger set of characters";
//        RegexPrintUtil.find("au", text); // find a or u
//        RegexPrintUtil.find("[a-c]", text); // find a, b, or c
        RegexPrintUtil.find("[a-h&&[aeiou]]", text); // ab , bb, ..., or zb
    }
}
