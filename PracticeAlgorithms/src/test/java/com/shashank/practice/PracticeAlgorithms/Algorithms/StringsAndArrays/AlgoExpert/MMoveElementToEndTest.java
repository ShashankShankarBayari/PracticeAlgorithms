package com.shashank.practice.PracticeAlgorithms.Algorithms.StringsAndArrays.AlgoExpert;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class MMoveElementToEndTest {

    private MMoveElementToEnd cut;

    @BeforeEach
    void setup() {
        cut = new MMoveElementToEnd();
    }

    @Test
    void move() {
        cut.move(new ArrayList<>(Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2)), 2);
    }
}