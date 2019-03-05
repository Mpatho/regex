package com.psybergate.learning.regex.common;

import org.junit.Test;

import java.util.Set;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BaseExampleTest {

    private final String text = "Hello Regex, hoping this will be funny.";
    private BaseExample baseExample = new BaseExample() {
        public void runContains() {
        }

        public void runFindAll() {
        }
    };

    @Test
    public void containHelloRegex() {
        String sentence = "Hello Regex";

        boolean result = baseExample.contains(sentence, text);

        assertThat(result, is(true));
    }

    @Test
    public void containHelloRegexp() {
        String sentence = "Hello Regexp";

        boolean result = baseExample.contains(sentence, text);

        assertThat(result, is(false));
    }

    @Test
    public void findExisting() {
        String regex = "Hello Rege[x]*";
        String expected = "Hello Regex";

        Set<String> result = baseExample.findAll(regex, text);

        assertThat(result.contains(expected), is(true));
    }

}
