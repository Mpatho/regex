package com.psybergate.learning.regex.common;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class BaseExample implements Example {

    protected boolean contains(String regex, String text) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }

    protected Set<String> findAll(String regex, String text) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        Set<String> matches = new HashSet<String>();
        while (matcher.find()) {
            matches.add(matcher.group());
        }
        return matches;
    }

    protected void printContains(boolean contain) {
        if (contain) {
            System.out.println("Matches exist");
        } else {
            System.out.println("No matches");
        }
    }

    protected void printAll(Collection<String> strings) {
        if (strings.isEmpty()) {
            System.out.println("** No String to print **");
        }
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
