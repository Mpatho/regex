package com.psybergate.learning.core.regex.example;

import com.psybergate.learning.core.regex.common.Example;
import com.psybergate.learning.core.regex.util.RegexPrintUtil;

public class AlterationExample implements Example {
    public static void main(String[] args) {
        String text = "The character class is the most basic regex concept after a literal find. " +
                "It makes one small sequence of characters find a larger set of characters";
        RegexPrintUtil.find("ma|es", text);
    }
}
