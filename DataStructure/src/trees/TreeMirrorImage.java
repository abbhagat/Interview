package trees;

public class TreeMirrorImage {

    void mirrorImage(BST root) {
        if (root != null) {
            mirrorImage(root.left);
            mirrorImage(root.right);
            BST temp;
            temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
    }
}
