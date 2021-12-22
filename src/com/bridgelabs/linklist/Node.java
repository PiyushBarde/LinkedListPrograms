package com.bridgelabs.linklist;

public class Node< T > {
     public T key;
     public Node next;

    public void setNext(Node next)
    {
        this.next = next;
    }

    public Node getNext()
    {
        return next;
    }

    public Node(T key) {
        this.key = key;
        this.next = null;
    }

}
