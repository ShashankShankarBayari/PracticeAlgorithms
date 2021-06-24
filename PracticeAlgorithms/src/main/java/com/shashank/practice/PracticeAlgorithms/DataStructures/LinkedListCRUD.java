package com.shashank.practice.PracticeAlgorithms.DataStructures;

import java.util.List;

public class LinkedListCRUD {

    private Node head = null;

    public Node add(int data) {
        if (head == null) {
            head = createNode(data, null);
        } else {
            Node lastNode = traverseToIndex(getSizeOfLinkedList(head));
            lastNode.next = createNode(data, null);
        }
        return head;
    }

    public void addAll(List<Integer> dataList) {
        for (Integer data : dataList) {
            add(data);
        }
    }

    public void insertAt(int index, int data) {
        if ((head == null && index > 0) || index > getSizeOfLinkedList(head)) {
            System.out.println("Invalid index for the current linkedList");
        } else {
            if (index == 0) {
                head = createNode(data, head);
            } else {
                Node nodeAtIndex = traverseToIndex(index);
                nodeAtIndex.next = createNode(data, nodeAtIndex.next);
            }
        }
    }

    public void deleteAt(int index) {
        if ((head == null && index > 0) || index > getSizeOfLinkedList(head)) {
            System.out.println("Invalid index for the current linkedList");
        } else {
            if (index == 0) {
                head = head.next;
            } else {
                Node nodeAtIndex = traverseToIndex(index);
                nodeAtIndex.next = nodeAtIndex.next.next;
            }
        }
    }

    public void reverse() {
        Node currentNode = head;
        Node nextNode;
        Node tempNode = null;

        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = tempNode;
            tempNode = currentNode;
            currentNode = nextNode;
        }
        head = tempNode;
    }

    public void reverseRecursive(Node currentNode) {
        if (currentNode.next == null) {
            head = currentNode;
            return;
        }
        reverseRecursive(currentNode.next);
        Node nextNode = currentNode.next;
        nextNode.next = currentNode;
        currentNode.next = null;
    }

    public void reversePrint(Node node) {
        if (node == null) {
            return;
        }
        reversePrint(node.next);
        System.out.println(node.data);
    }

    private Node traverseToIndex(int index) {
        Node currentNode = head;
        if ((head == null && index > 0) || index > getSizeOfLinkedList(head)) {
            System.out.println("Invalid index for the current linkedList");
        } else {
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
        }
        return currentNode;
    }

    private int getSizeOfLinkedList(Node head) {
        Node currentNode = head;
        int size = 1;
        while (currentNode.next != null) {
            size++;
            currentNode = currentNode.next;
        }
        return size;
    }

    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    private Node createNode(int data, Node next) {
        Node node = new Node();
        node.data = data;
        node.next = next;
        return node;
    }

}

class Node {
    public Node() {

    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public int data;
    public Node next;

}