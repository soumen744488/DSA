package Tree.Constructor;

public class BinarySearchTree {

    // CREATE CLASS VARIABLE (ROOT) AND NODE CLASS HERE//
    //                                                 //
    //                                                 //
    //                                                 //
    //                                                 //
    /////////////////////////////////////////////////////
    Node root;

    class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value= value;
        }
    }

    public Node getRoot() {
        return root;
    }

}