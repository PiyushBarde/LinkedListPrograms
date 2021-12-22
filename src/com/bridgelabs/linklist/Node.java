package com.bridgelabs.linklist;

public  class  Node{
    Node next;
    int key;
    static Node head;

    public Node(int key) {
        this.key = key;
        this.next = null;

    }
}
