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
                root.setRightChild(newNode);
        }else if ((root.leftChild == null) && (newNodeInt<root.getRoot())){
                Node newNode = new Node(newNodeInt);
                root.setLeftChild(newNode);
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
        return rowQtyNode(root, count);
    }

    public int rowQtyNode(Node node, int count){
        if ((node.getLeftChild()!=null)){
            count++;
            return rowQtyNode(node.getLeftChild(), count);
        }else if(node.getRightChild()!=null){
            count++;
            return rowQtyNode(node.getRightChild(), count);
        }
        return count;
    }

    public static void printTree(Node root){
        if(root!=null){
            printTree(root.getLeftChild());
            System.out.println(root.getRoot());
            printTree(root.getRightChild());
        }

    }

}
