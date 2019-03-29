package com.psybergate.learning.core.regex.example;

import com.psybergate.learning.core.regex.common.Example;
import com.psybergate.learning.core.regex.util.RegexPrintUtil;

/**
 * Backreferences match the same text as previously matched by a capturing group
 */
public class BackreferenceExample implements Example {

    public static void main(String[] args) {
        String text = "Testing <B><I>bold italic</I></B>";
//        RegexPrintUtil.find("<([A-Z][A-Z0-9]*)>.*</\\1>", text);
        RegexPrintUtil.find("<(?<tag>[A-Z][A-Z0-9]*)>.*?</\\1>", text);
    }
}
