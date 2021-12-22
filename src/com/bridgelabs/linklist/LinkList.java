package com.bridgelabs.linklist;

public class LinkList {
    static Node head;
    static int length = 0;

    static  void addFirst(int key){
        Node newNode = new Node(key);
        if(key==30){
            addFirst(40);
        }
        if(key==40)
        {
            System.out.println("Node 40 removed");
            return;
        }
        length++;
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;


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

    static void findElement(){
        int counter = 1;
        while(head.key!=30){
            counter++;
            head=head.next;
        }
        System.out.println("Node "+ counter + " is equal to 30");

        }


    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.addFirst(70);
        linkList.addFirst(30);
        linkList.addFirst(56);


        printLinkList();
        findElement();
        System.out.println("length of linklist is " + length);


    }
}
