package com.shashank.practice.PracticeAlgorithms.Algorithms.StringsAndArrays.HackerRank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class NewYearChaosTest {

    @Test
    void printNumberOfBribes() {
        NewYearChaos cut = new NewYearChaos();
        //cut.printNumberOfBribes(Arrays.asList(2, 1, 5, 3, 4));
        //cut.printNumberOfBribes(Arrays.asList(2, 5, 1, 3, 4));
        cut.printNumberOfBribes(Arrays.asList(1, 2, 5, 3, 7, 8, 6, 4));
    }
}