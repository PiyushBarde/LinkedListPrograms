package com.bridgelabs.linklist;

public class LinkList {
    static Node head;

    public  void appendingMethod(int key)
    {
        Node newNode = new Node(key);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode =head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public static void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
    }
    static void printLinkList(){
        if( head == null )
        {
            System.err.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            System.out.print(currNode.key + " -> ");
            currNode=currNode.next;
        }
      System.out.println(currNode.key);
    }

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.appendingMethod(56);
        linkList.appendingMethod(30);
        linkList.appendingMethod(70);
        deleteFirst();
        printLinkList();

    }
}
