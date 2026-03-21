package DoublyLinkedList.ReverseBetween;

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

    public void reverseBetween(int startIndex, int endIndex) {
        //   +===================================================+
        //   |               WRITE YOUR CODE HERE                |
        //   | Description:                                      |
        //   | - Reverses a portion of a doubly linked list      |
        //   |   between two indices (inclusive range).          |
        //   | - Only nodes between startIndex and endIndex are  |
        //   |   reversed in place.                              |
        //   |                                                   |
        //   | Behavior:                                         |
        //   | - A dummy node simplifies handling edge cases.    |
        //   | - `prev` is positioned just before the reversal.  |
        //   | - Nodes are relocated one at a time to reverse    |
        //   |   their order within the specified segment.       |
        //   | - All `next` and `prev` pointers are correctly    |
        //   |   updated to maintain list integrity.             |
        //   | - The head pointer is reset at the end.           |
        //   +===================================================+
        if(head == null || startIndex== endIndex ) return;
        Node d1 = new Node(0);
        d1.next= head;
        head.prev = d1;

        Node prevs = d1;


        for (int i =0; i< startIndex ;i++ ){
            prevs= prevs.next;
        }
        Node current = prevs.next;
        for(int i=0;i< endIndex-startIndex; i++){
            Node nodeMove = current.next;
            current.next= nodeMove.next;
            if (nodeMove.next != null) {
                nodeMove.next.prev = current;
            }
            nodeMove.next= prevs.next;
            prevs.next.prev= nodeMove;
            prevs.next= nodeMove;
            nodeMove.prev= prevs;
        }
        head= d1.next;
        head.prev= null;
    }

}



