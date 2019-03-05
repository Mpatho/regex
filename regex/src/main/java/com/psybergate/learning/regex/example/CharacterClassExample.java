package com.psybergate.learning.regex.example;

import com.psybergate.learning.regex.common.BaseExample;


/**
 *
 */
public class CharacterClassExample extends BaseExample {

    private final String text = "The purpose of gitignore files is to ensure that certain files not tracked by Git remain untracked.";

    public void runContains() {
        printContains(contains("[au]", text));
        printContains(contains("[a-c]", text));
        printContains(contains("[a-z]b", text));
    }

    public void runFindAll() {
        printAll(findAll("[h-m]", text));
    }
}
