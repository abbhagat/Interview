package trees;

import static trees.GivenInOrderAndPreOrderGenerateOriginalTree.buildTree;
import static trees.TreeTraversal.*;

public class BinaryTreeTraversal {

    public static void main(String[] args) {
        BinaryTree BT = new BinaryTree();
        BST root = null;
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int x : a) {
            root = BT.createBT(x, root);
        }
        inorder(root);
        System.out.println();
        inOrderWithoutRecursion(root);
        System.out.println();
        preorder(root);
        System.out.println();
        preOrderWithoutRecursion(root);
        System.out.println();
        postorder(root);
        System.out.println();
        postOrderWithoutRecursion(root);
        System.out.println();
        int[] inorder = {10, 8, 6, 4, 2, 1, 3, 5, 7, 9};
        int[] preorder = {1, 2, 4, 6, 8, 10, 3, 5, 7, 9};
        root = buildTree(inorder, preorder, 0, inorder.length - 1);
        postorder(root);
        TreeHeight height = new TreeHeight();
        System.out.println("\nTree Height :" + height.treeHeight(root));
        CreateBST BST = new CreateBST();
        root = null;
        for (int x : a) {
            root = BST.createBST(root, x);
        }
        preorder(root);
        height = new TreeHeight();
        System.out.println("\nTree Height :" + height.treeHeight(root));
    }
}
