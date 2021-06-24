package com.shashank.practice.PracticeAlgorithms.DataStructures;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

    private Map<String, Integer> vertices = new HashMap<>();
    private Map<Integer, DoublyNode> edges = new HashMap<>();

    public void addNodeToGraph(String vertex, List<Integer> connectedNodes) {
        int index = vertices.size();
        vertices.put(vertex, index);
        edges.put(index, createBinarySearchTreeOfConnectedNodes(index, connectedNodes));
    }

    public void printAllAdjacentNodesOf(String nodeName) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.Inorder(edges.get(vertices.get(nodeName)));
    }

    public boolean areTwoNodesConnected(String node1, String node2) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        DoublyNode rootOfConnectedNodesTree = edges.get(vertices.get(node1));
        int node2IntRepresentation = vertices.get(node2);
        return binarySearchTree.searchTreeForValue(node2IntRepresentation, rootOfConnectedNodesTree);
    }

    private DoublyNode createBinarySearchTreeOfConnectedNodes(int vertex, List<Integer> connectedNodes) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        DoublyNode root = binarySearchTree.insertNodeIterative(connectedNodes.get(0));
        for (int i = 1; i < connectedNodes.size(); i++) {
            binarySearchTree.insertNodeIterative(connectedNodes.get(i));
        }
        return root;
    }
}
