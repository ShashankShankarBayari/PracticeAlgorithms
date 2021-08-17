package com.shashank.practice.PracticeAlgorithms.Algorithms.StringsAndArrays.AlgoExpert;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class ETournamentWinnerTest {

    private ETournamentWinner cut;

    @BeforeEach
    void setup() {
        cut = new ETournamentWinner();
    }

    @Test
    void findWinner() {
        List<List<String>> competitions = Arrays.asList(Arrays.asList("HTML", "Java"), Arrays.asList("Java", "Python"),
                Arrays.asList("Python", "HTML"));
        List<Integer> results = Arrays.asList(0, 1, 1);
        System.out.println(cut.findWinner(competitions, results));
    }
}