package Tree.Insert;

public class BinarySearchTree {

    private Node root;

    class Node {
        public int value;
        public Node left;
        public Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public Node getRoot() {
        return root;
    }

    // WRITE INSERT METHOD HERE //
    //                          //
    //                          //
    //                          //
    //                          //
    //////////////////////////////
    public boolean insert(int val){
        Node newNode = new Node(val);
        if (root == null ){
            root = newNode;
            return true;

        }
        Node temp = root;
        while(temp != null){
            if (newNode.value == temp.value){
                return false;
            }
            else if (newNode.value < temp.value){
                if(temp.left == null){
                    temp.left= newNode; return true;
                }
                temp= temp.left;
            }else{
                if(temp.right == null){
                    temp.right= newNode; return true;
                }
                temp= temp.right;
            }

        }
        return true;
    }

}
