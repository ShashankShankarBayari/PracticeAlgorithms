package com.shashank.practice.PracticeAlgorithms.Algorithms.StringsAndArrays;

import com.shashank.practice.PracticeAlgorithms.Algorithms.StringsAndArrays.HackerRank.CountingValleys;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CountingValleysTest {

    private CountingValleys cut;

    @BeforeEach
    void setup() {
        cut = new CountingValleys();
    }

    @Test
    void countValleys() {
        System.out.println(cut.countValleys("UDDDUDUU"));
    }
}