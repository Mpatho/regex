package com.psybergate.learning.core.regex;

import com.psybergate.learning.core.regex.common.Exercise;
import com.psybergate.learning.core.regex.exercise.*;

public class ExerciseRunner {

    private ExerciseRunner() {
    }

    public static void main(String[] args) {
//        run(new CharacterExercise());
        run(new CharacterClassExercise());
//        run(new QuantifiersExercise());
//        run(new GroupingExercise());
//        run(new AnchorExercise());
    }

    private static void run(Exercise exercise) {
        String text = "POSIX Extended Regular Expressions can often be used with modern Unix utilities" +
                " by including the command line flag -E.";
    }
}
