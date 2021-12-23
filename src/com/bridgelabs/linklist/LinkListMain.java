package com.bridgelabs.linklist;

public class LinkListMain {
    public static void main(String[] args) {
        MyNode< Integer > myFirstNode = new MyNode<>(70);
        MyNode< Integer > mySecondNode = new MyNode<>(30);
        MyNode< Integer > myThirdNode = new MyNode<>(56);
        MyNode< Integer > myFourthNode = new MyNode<>(40);

        OrderedLinkList OrderedLinkList = new OrderedLinkList();


        OrderedLinkList.sortingNodesAndAddingThemInList(myFirstNode);
        OrderedLinkList.sortingNodesAndAddingThemInList(mySecondNode);
        OrderedLinkList.sortingNodesAndAddingThemInList(myThirdNode);
        OrderedLinkList.sortingNodesAndAddingThemInList(myFourthNode);

        OrderedLinkList.printList();

    }
}
