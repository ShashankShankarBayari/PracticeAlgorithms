package com.shashank.practice.PracticeAlgorithms.DataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class LinkedListCRUDTest {
    private LinkedListCRUD cut;

    @BeforeEach
    public void setUp() {
        cut = new LinkedListCRUD();
    }

    @Test
    public void testAdd() {
        cut.add(4);
        cut.add(5);
        cut.add(10);
        cut.show();
    }

    @Test
    public void testAddAll() {
        List<Integer> dataList = new ArrayList<>(Arrays.asList(2, 8, 9));
        cut.addAll(dataList);
        cut.show();
    }

    @Test
    public void testInsertAt() {
        List<Integer> dataList = new ArrayList<>(Arrays.asList(2, 8, 9, 10));
        cut.addAll(dataList);
        cut.insertAt(2, 4);
        cut.show();
    }

    @Test
    public void testDeleteAt() {
        List<Integer> dataList = new ArrayList<>(Arrays.asList(2, 8, 9, 10));
        cut.addAll(dataList);
        cut.deleteAt(2);
        cut.show();
    }

    @Test
    public void testReverse() {
        List<Integer> dataList = new ArrayList<>(Arrays.asList(2, 8, 9, 10));
        cut.addAll(dataList);
        cut.reverse();
        cut.show();
    }

    @Test
    public void testReversePrint() {
        Node head = cut.add(4);
        cut.add(5);
        cut.add(6);
        cut.add(7);
        cut.reversePrint(head);
    }

    @Test
    public void testRecursiveReverse() {
        Node head = cut.add(4);
        cut.add(5);
        cut.add(6);
        cut.add(7);
        cut.reverseRecursive(head);
        cut.show();
    }

}