package trees;

public class LevelOrderTreeTraversal {

    TreeHeight th = new TreeHeight();

    void levelOrderTreeTraversal(BST root) {

        for (int i = 1; i <= th.treeHeight(root); i++) {
            printLevelOrder(root, i);
        }
    }

    void printLevelOrder(BST root, int i) {
        if (root == null) {
            return;
        }
        if (i == 1) {
            System.out.print(root.num + " ");
        }
        if (i > 1) {
            printLevelOrder(root.left,  i - 1);
            printLevelOrder(root.right, i - 1);
        }
    }
}
