package com.aswin.dev;

/**
 * @author aswin
 * All Non -primitive types are dynamically allocated in java: LinkedList is a non-primitive type
 * They are non contigous
 */

class Node{
    int data;
    Node nextNode; // This makes it a self-referential structure

    public Node(int data){
        this.data = data;
        this.nextNode = null;
    }
}
public class SimpleLinkedList_001 {
    /* Created by Aswin on 11/11/2021 */
    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);

        node1.nextNode = node2;
        node2.nextNode = node3;

        Node startNode = node1;
        while(startNode!=null){
            System.out.print(startNode.data+" --> ");
            if(startNode.nextNode==null){
                System.out.println(" NULL ");
            }
            startNode = startNode.nextNode;
        }
    }
}
