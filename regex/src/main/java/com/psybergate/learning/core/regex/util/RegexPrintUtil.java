package com.psybergate.learning.core.regex.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPrintUtil {

    public static void find(String regex, String text) {
        List<String> matches = findAll(regex, text);
        highlightMatchesInGray(matches, text);
        printAll(matches);
    }

    public static void findGroups(String regex, String text) {
        List<String> matches = findAllGroups(regex, text);
        highlightMatchesInGray(matches, text);
        printAll(matches);
    }

    private static List<String> findAll(String regex, String text) {
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(text);
        List<String> matches = new ArrayList<>();
        while (matcher.find()) {
            if (!matcher.group().isEmpty()) {
                matches.add(matcher.group());
            }
        }
        return matches;
    }

    private static List<String> findAllGroups(String regex, String text) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<String> matches = new ArrayList<>();
        while (matcher.find()) {
            for (int group = 1; group <= matcher.groupCount(); group++) {
                if (!matcher.group(group).isEmpty()) {
                    matches.add(matcher.group(group));
                }
            }
        }
        return matches;
    }

    private static void printAll(Collection<String> strings) {
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

    private static void highlightMatchesInGray(List<String> matches, String text) {
        int start = 0;
        for (String match : matches) {
            int indexOf = text.indexOf(match, start);
            start = highlightMatchesInGray(text, start, indexOf, indexOf + match.length());
        }
        System.out.println(text.substring(start));
    }

    private static int highlightMatchesInGray(String text, int offsetIndex, int startMatchIndex, int endMatchIndex) {
        System.out.print(text.substring(offsetIndex, startMatchIndex));
        System.out.print("\033[47m" + text.substring(startMatchIndex, endMatchIndex) + "\033[0m");
        return endMatchIndex;
    }
}
