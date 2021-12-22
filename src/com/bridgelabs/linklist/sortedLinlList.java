package com.bridgelabs.linklist;

public class sortedLinlList {
    void sortedInsert(Integer key){
        Node head = null;
    Node newNode = new Node(key);
    if (head == null || (head.key.compareTo(newNode.key) == 1 || head.key.compareTo(newNode.key) == 0))
    {
        newNode.next = head;
        head = newNode;
    }
    else {
        Node currNode = head;
        while (currNode.next != null && (currNode.next.key.compareTo(currNode.key) == -1)) {


            currNode = currNode.next;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;

    }
}
}
