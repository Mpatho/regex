package com.psybergate.learning.regex.example;

import com.psybergate.learning.regex.common.Example;

public class ExampleRunner {

    private ExampleRunner() {
    }

    public static void main(String[] args) {
        run(new HelloExample());
        run(new CharacterClassExample());
        run(new QuantifiersExample());
    }

    private static void run(Example example) {
        example.run();
    }
}

