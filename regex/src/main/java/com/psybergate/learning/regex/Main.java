package com.psybergate.learning.regex;

import com.psybergate.learning.regex.common.Example;
import com.psybergate.learning.regex.example.CharacterClassExample;
import com.psybergate.learning.regex.example.HelloExample;

public class Main {

    public static void main(String[] args) {
//        runExample(new HelloExample());
        runExample(new CharacterClassExample());
    }

    private static void runExample(Example example) {
        example.runContains();
        example.runFindAll();
    }
}
