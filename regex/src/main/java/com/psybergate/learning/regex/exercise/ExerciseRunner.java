package com.psybergate.learning.regex.exercise;

import com.psybergate.learning.regex.common.Exercise;

public class ExerciseRunner {

    private ExerciseRunner() {
    }

    public static void main(String[] args) {
        run(new HelloExercise());
        run(new CharacterClassExercise());
        run(new QuantifiersExercise());
    }

    private static void run(Exercise exercise) {
        String text = "POSIX Extended Regular Expressions can often be used with modern Unix utilities" +
                " by including the command line flag -E.";
        exercise.answer(text);
    }
}
