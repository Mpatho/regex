package com.psybergate.learning.regex.example;

import org.junit.Test;

import java.util.Set;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BaseRegexTest {

    private final String text = "Hello Regex, hoping this will be funny.";
    private BaseRegex baseRegex = new BaseRegex() {
    };

    @Test
    public void containHelloRegex() {
        String sentence = "Hello Regex";

        boolean result = baseRegex.contains(sentence, text);

        assertThat(result, is(true));
    }

    @Test
    public void containHelloRegexp() {
        String sentence = "Hello Regexp";

        boolean result = baseRegex.contains(sentence, text);

        assertThat(result, is(false));
    }

    @Test
    public void findExisting() {
        String regex = "Hello Rege[x]*";
        String expected = "Hello Regex";

        Set<String> result = baseRegex.findAll(regex, text);

        assertThat(result.contains(expected), is(true));
    }

}
