package com.bridgelabs.linklist;

public class LinkList {
    static Node head;
    static int length = 0;


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
    void sortedInsert(Integer key){
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


    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.sortedInsert(70);
        linkList.sortedInsert(30);
        linkList.sortedInsert(56);
        linkList.sortedInsert(40);


        printLinkList();
        findElement();
        System.out.println("length of linklist is " + length);


    }
}
