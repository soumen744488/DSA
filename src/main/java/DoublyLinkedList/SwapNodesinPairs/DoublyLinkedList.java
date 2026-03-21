package DoublyLinkedList.SwapNodesinPairs;

public class DoublyLinkedList {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
    }

    public Node getHead() {
        return head;
    }

    public void printList() {
        StringBuilder output = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            output.append(temp.value);
            if (temp.next != null) {
                output.append(" <-> ");
            }
            temp = temp.next;
        }
        System.out.println(output.toString());
    }

    public void makeEmpty() {
        head = null;
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
            newNode.prev = current;
        }
    }

    // WRITE THE SWAPPAIRS METHOD HERE //
    //                                 //
    //                                 //
    //                                 //
    //                                 //
    /////////////////////////////////////
    public void swapPairs(){

        // if(head== null ) return;
        // if(head.next == null) return;
        Node d1 = new Node(0);
        d1.next = head;
        Node Previous = d1;
        while(head != null && head.next!= null){
            Node first = head;
            Node second = head.next;
            Previous.next= second;
            first.next= second.next;
            second.next=first;
            second.prev=Previous;
            first.prev= second;
            if(first.next!=null) first.next.prev= first;
            head= first.next;
            Previous= first;

        }
        head= d1.next;
        if (head != null) head.prev = null;




        // Node temp= head;
        // while(temp!= null){
        //     Node tempN = temp.next;
        //     temp.next=tempN.next;
        //     tempN.next.prev= temp;
        //     tempN.next=temp;

        //      temp = temp.next;
        // }
    }

}


