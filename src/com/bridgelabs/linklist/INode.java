package com.bridgelabs.linklist;


public interface INode<T extends Comparable> {
    T getKey();
    void setKey(T key);

    INode getNext();
    void setNext(INode next);


}
