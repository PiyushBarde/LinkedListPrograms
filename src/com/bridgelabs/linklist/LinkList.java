package com.bridgelabs.linklist;

public class LinkList {
    static Node head;

    public  void addingValuesFromFirst(int key){
        Node newNode = new Node(key);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    static void printLinkList(){
        if( head == null ){
            System.err.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.key + " -> ");
            currNode=currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.addingValuesFromFirst(70);
        linkList.addingValuesFromFirst(30);
        linkList.addingValuesFromFirst(56);
        printLinkList();

    }
}
