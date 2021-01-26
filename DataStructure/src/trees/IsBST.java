package trees;

public class IsBST {
    public static final boolean isBST(BST root, int min, int max) {
        if (root == null) {
            return true;
        } else if (root.left.num < min || root.right.num > max) {
            return false;
        } else {
            return isBST(root.left, min, root.num) && isBST(root.right, root.num, max);
        }
    }
}
