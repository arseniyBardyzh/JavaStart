package Java_Core_10;

import static Java_Core_10.Node.addNode;

public class Task1 {
    public static void main(String[] args) {
        Node root = new Node(20);
        System.out.println(root.searchLastNode(root));
        addNode(23, root);
        System.out.println(root.searchLastNode(root));
        addNode(14, root);
        System.out.println(root.searchLastNode(root));
        addNode(11, root);
        System.out.println(root.searchLastNode(root));

    }
}
