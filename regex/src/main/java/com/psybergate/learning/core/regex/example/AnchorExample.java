package com.psybergate.learning.core.regex.example;

import com.psybergate.learning.core.regex.common.Example;
import com.psybergate.learning.core.regex.util.RegexPrintUtil;

/**
 * Anchors are a different breed. They do not match any character at all.
 * Instead, they match a position before, after, or between characters
 */
public class AnchorExample implements Example {
    public static void main(String[] args) {
        String text = "Anchors belong to the family of regex tokens that don't match any characters " +
                "but that assert something about the string or the matching process.\n" +
                "Anchors assert that the engine's current position in the string matches a well-determined location: " +
                "for instance, the beginning of the string, or the end of a line.\n";
        RegexPrintUtil.find("^\\w+", text); //
        RegexPrintUtil.find("\\.$", text);

        RegexPrintUtil.find("\\A\\w+", text);
        RegexPrintUtil.find(".{5}\\Z", text);
    }
}
