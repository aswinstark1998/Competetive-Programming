package com.aswin.dev;

/**
 * @author aswin
 */

class Node1 {
    int data;
    Node1 nextNode; // This makes it a self-referential structure

    public Node1(int data) {
        this.data = data;
        this.nextNode = null;
    }
}


public class RecursiveTraversalOfLinkedList_002 {
    /* Created by aswin on 11/11/2021 */

    public static void main(String[] args) {

        Node1 node1 = new Node1(10);
        Node1 node2 = new Node1(20);
        Node1 node3 = new Node1(30);

        node1.nextNode = node2;
        node2.nextNode = node3;

        Node1 startNode = node1;
        printNode(startNode);
//        while (startNode != null) {
//            System.out.print(startNode.data + " --> ");
//            if (startNode.nextNode == null) {
//                System.out.println(" NULL ");
//            }
//            startNode = startNode.nextNode;
//        }
    }

    public static void printNode(Node1 node) {
        if (node == null) {
            System.out.print(" NULL");
        } else {
            System.out.print(node.data + " --> ");
            printNode(node.nextNode);
        }
    }
}
