package com.shashank.practice.PracticeAlgorithms.Algorithms.BinarySearchTrees;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class ConstructBSTFromPreOderArrayTest {

    private ConstructBSTFromPreOderArray cut;

    @Test
    void constructBST() {
        cut = new ConstructBSTFromPreOderArray();
        cut.constructBST(new ArrayList<>(Arrays.asList(10, 4, 2, 1, 5, 17, 19, 18)));
    }
}