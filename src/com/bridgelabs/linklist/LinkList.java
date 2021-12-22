package com.bridgelabs.linklist;

public class LinkList {
    static Node head;

    public  Node appendingMethod(int key)
    {
        Node newNode = new Node(key);
        if(head==null){
            head=newNode;
            return null;
        }
        Node currNode =head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
        return newNode;
    }
//    public static void deleteLast(){
//        if(head==null){
//            System.out.println("List is empty");
//            return;
//        }
//        Node secondLast = head;
//        Node currNode = head.next;
//        while (currNode.next!=null){
//            currNode=currNode.next;
//            secondLast=secondLast.next;
//        }
//        secondLast.next = null;
//   }
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
        linkList.appendingMethod(56);
        linkList.appendingMethod(30);
        linkList.appendingMethod(70);

        printLinkList();
        findElement();

    }
}
