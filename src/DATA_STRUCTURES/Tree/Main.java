package DATA_STRUCTURES.Tree;


public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(7);
        tree.insert(13);
        tree.insert(8);
        tree.insert(45);
        tree.insert(1);

        tree.inOrder();
        tree.preOrder();
        tree.postOrder();
    }
}
