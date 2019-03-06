package com.psybergate.learning.regex.common;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class BaseExample implements Example {

    protected void find(String regex, String text) {
        highlightMatchesInGray(regex, text);
        printAll(findAll(regex, text));
    }

    private Set<String> findAll(String regex, String text) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        Set<String> matches = new HashSet<String>();
        while (matcher.find()) {
            matches.add(matcher.group());
        }
        return matches;
    }

    private void printAll(Collection<String> strings) {
        if (strings.isEmpty()) {
            System.out.print("** No String to print **");
        }
        for (String string : strings) {
            if (string.isEmpty()) {
                continue;
            }
            System.out.print("\033[4m" + string + "\033[0m ");
        }
        System.out.println("\n");
    }

    private void highlightMatchesInGray(String regex, String text) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int start = 0;
        while (matcher.find()) {
            if (matcher.start() < matcher.end()) {
                start = highlightMatchesInGray(text, start, matcher.start(), matcher.end());
            }
        }
        System.out.println(text.substring(start));
    }

    private int highlightMatchesInGray(String text, int offsetIndex, int startMatchIndex, int endMatchIndex) {
        System.out.print(text.substring(offsetIndex, startMatchIndex));
        System.out.print("\033[47m" + text.substring(startMatchIndex, endMatchIndex) + "\033[0m");
        return endMatchIndex;
    }
}
