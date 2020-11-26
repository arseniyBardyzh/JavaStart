package Java_Core_10;

import static Java_Core_10.Node.addNode;

public class Task1 {
    public static void main(String[] args) {
        //Создаем родителя
        Node root = new Node(20);
        //Заполняем дерево
        addNode(23, root);
        addNode(14, root);
        addNode(11, root);
        addNode(16, root);
        addNode(5, root);
        addNode(15, root);
        addNode(18, root);
        addNode(8, root);
        addNode(22, root);
        addNode(27, root);
        addNode(24, root);
        addNode(150, root);




        System.out.println(root.searchLastNode(root));

        Node.printTree(root);

    }
}
