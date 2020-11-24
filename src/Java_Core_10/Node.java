package Java_Core_10;


public class Node {
    private Node leftChild;
    private Node rightChild;
    private int root;
    public Node(int root){
        this.leftChild = null;
        this.rightChild = null;
        this.root = root;
    }

    public int getRoot() {
        return root;
    }

    public void setRoot(int root) {
        this.root = root;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public static void addNode(int newNodeInt, Node root){
        if ((root.rightChild == null) && (newNodeInt>=root.getRoot())){
                Node newNode = new Node(newNodeInt);
                root.rightChild = newNode;
        }else if ((root.leftChild == null) && (newNodeInt<root.getRoot())){
                Node newNode = new Node(newNodeInt);
                root.leftChild = newNode;
        }else{
            if(newNodeInt<root.getRoot()){
                addNode(newNodeInt, root.getLeftChild());
            }else{
                addNode(newNodeInt, root.getRightChild());
            }
        }
    }

    public int searchLastNode(Node root){
        int count = 1;
        if (root.getLeftChild()!=null){
            count++;
            searchLastNode(root.getLeftChild());
        }else if(root.getRightChild()!=null){
            count++;
            searchLastNode(root.getRightChild());
        }
        return count;
    }


}
