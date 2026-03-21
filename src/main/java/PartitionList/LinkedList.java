package PartitionList;

public class LinkedList {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        if (temp == null) {
            System.out.println("empty");
        } else {
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }
    }

    public void makeEmpty() {
        head = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    // WRITE THE PARTITIONLIST METHOD HERE //
    //                                     //
    //                                     //
    //                                     //
    //                                     //
    /////////////////////////////////////////
    public void partitionList(int partVal){
        Node d1 = new Node(0);
        Node temp1= d1;
        Node d2 = new Node(0);
        Node temp2= d2;
        Node run = head;
        //  if(head== null)
        while(run!= null){
            if (run.value < partVal){
                temp1.next=run;
                temp1=run;
            }else{
                temp2.next=run;
                temp2=run;
            }

            run= run.next;
        }
        temp1.next= d2.next;
        temp2.next= null;
        head = d1.next;

    }

}


