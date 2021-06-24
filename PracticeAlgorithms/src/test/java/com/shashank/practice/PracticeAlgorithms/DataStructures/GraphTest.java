package com.shashank.practice.PracticeAlgorithms.DataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class GraphTest {

    private Graph cut;

    @BeforeEach
    void setUp() {
        cut = new Graph();
    }

    @Test
    void addNodeToGraph() {
        /*   Let us create following BST
              A(0)  ---  B(1)
           /     \       |   \
          C(2)   D(3)  E(4) F(5)
          \        \   /   /
          G(6)       H(7)             */
        cut.addNodeToGraph("A", Arrays.asList(1, 2, 3));
        cut.addNodeToGraph("B", Arrays.asList(0, 4, 5));
        cut.addNodeToGraph("C", Arrays.asList(0, 6));
        cut.addNodeToGraph("D", Arrays.asList(0, 7));
        cut.addNodeToGraph("E", Arrays.asList(1, 7));
        cut.addNodeToGraph("F", Arrays.asList(1, 7));
        cut.addNodeToGraph("G", Arrays.asList(2, 7));
        cut.addNodeToGraph("H", Arrays.asList(3, 4, 5, 6));
        cut.printAllAdjacentNodesOf("G");
        System.out.println(cut.areTwoNodesConnected("D", "H"));
    }
}