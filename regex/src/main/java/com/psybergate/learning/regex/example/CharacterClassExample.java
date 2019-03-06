package com.psybergate.learning.regex.example;

import com.psybergate.learning.regex.common.BaseExample;


/**
 * [abc] imply a, b, or c
 * [^abc] imply any character except a, b, or c
 * [a-z] imply a, z, or any character that come after a and before z
 * [a-m[n-z]] imply union of [a-m] and [n-z] same as [a-mn-z]
 * [a-y&&[wxyz]] imply intersection of [a-y] and [wxyz] same as [wxy]
 */
public class CharacterClassExample extends BaseExample {

    public void run() {
        String text = "The character class is the most basic regex concept after a literal find. " +
                "It makes one small sequence of characters find a larger set of characters";
        find("[au]", text);
        find("[a-z]b", text);
        find("[a-c]", text);
    }
}
