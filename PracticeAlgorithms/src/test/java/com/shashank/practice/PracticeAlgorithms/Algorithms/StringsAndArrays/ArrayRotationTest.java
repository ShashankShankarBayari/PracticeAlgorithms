package com.shashank.practice.PracticeAlgorithms.Algorithms.StringsAndArrays;

import com.shashank.practice.PracticeAlgorithms.Algorithms.StringsAndArrays.HackerRank.ArrayRotation;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ArrayRotationTest {

    @Test
    void rotateLeft() {
        ArrayRotation cut = new ArrayRotation();
        List<Integer> output = cut.rotateLeft(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)), 4);
        output.forEach(element -> System.out.println(element));
    }
}