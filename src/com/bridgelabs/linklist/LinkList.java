package com.bridgelabs.linklist;

public class LinkList {
    public  void linkingThreeValues(){
        Node< Integer > myFirstNode = new Node<>(56);
        Node< Integer > mySecondNode = new Node<>(30);
        Node< Integer > myThirdNode = new Node<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
    }
}
