package com.shashank.practice.PracticeAlgorithms.Algorithms.LinkedLists;

import com.shashank.practice.PracticeAlgorithms.DataStructures.LinkedListCRUD;
import com.shashank.practice.PracticeAlgorithms.DataStructures.Node;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class MRemoveKthNodeFromEndTest {

    private MRemoveKthNodeFromEnd cut;
    private LinkedListCRUD linkedList;

    @Test
    void removeKthElement() {
        linkedList = new LinkedListCRUD();
        Node head = linkedList.addAll(new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)));
        cut = new MRemoveKthNodeFromEnd();
        cut.removeKthElement(head, 9);
    }
}