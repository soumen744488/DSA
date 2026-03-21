package SwapNodesinPairs;

public class LinkedList {

    private Node head;

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
    }

    public Node getHead() {
        return head;
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
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }


    public void swapPairs() {
        Node d1 = new Node(0);
        d1.next = head;
        Node pre = d1;
        Node first = head;
        // Node second ;
        if( head != null){
            while(first!= null && first.next != null){
                Node second = first.next;
                pre.next = second;
                first.next = second.next;
                second. next =  first;
                pre = first;
                first= first.next;
            }
            head= d1.next;
        }



    }

}

