package DoublyLinkedList.PartitionList;

public class DoublyLinkedList {

    private Node head;

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

    public void partitionList(int x) {
        //   +===================================================+
        //   |               WRITE YOUR CODE HERE                |
        //   | Description:                                      |
        //   | - Partitions a doubly linked list around a value  |
        //   |   `x`.                                            |
        //   | - Nodes with values less than `x` come before     |
        //   |   nodes with values greater than or equal to `x`. |
        //   |                                                   |
        //   | Behavior:                                         |
        //   | - Uses two dummy nodes to build two sublists:     |
        //   |   one for < x, one for >= x.                      |
        //   | - Traverses the list, linking nodes to the        |
        //   |   appropriate sublist and updating prev pointers. |
        //   | - Joins the two sublists together.                |
        //   | - Updates the head and resets head.prev to null.  |
        //   +===================================================+
        if (head == null) return;
        Node d1 = new Node(0);
        Node prev1 = d1;
        Node d2 = new Node(0);
        Node prev2= d2;
        Node temp = head;

        while(temp != null){
            if(temp.value < x){
                prev1.next= temp;
                temp.prev=prev1;
                prev1= temp;
            }else{
                prev2.next = temp;
                temp.prev=prev2;
                prev2= temp;
            }
            temp= temp.next;
        }
        prev2.next=null;
        prev1.next=d2.next;
        //   d2.next= null;
        if(d2.next!=null){
            d2.next.prev= prev1;
        }
        head=d1.next ;
        if (head != null) {
            head.prev = null;
        }

    }

}



