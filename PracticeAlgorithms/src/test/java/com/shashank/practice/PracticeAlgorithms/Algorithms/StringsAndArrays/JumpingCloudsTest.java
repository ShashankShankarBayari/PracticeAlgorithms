package com.shashank.practice.PracticeAlgorithms.Algorithms.StringsAndArrays;

import com.shashank.practice.PracticeAlgorithms.Algorithms.StringsAndArrays.HackerRank.JumpingClouds;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class JumpingCloudsTest {
    private JumpingClouds cut;

    @BeforeEach
    void setup() {
        cut = new JumpingClouds();
    }

    @Test
    void findMinimumNumberOfJumps() {
        System.out.println(cut.findMinimumNumberOfJumps(Arrays.asList(0, 0, 1, 0, 0, 1, 0)));
    }
}