package Exercises_Examples.BinaryTree;

import javax.management.ListenerNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(TreeNode root) {
        this.root = root;
    }
    private void preorderRecursive(TreeNode node, List<Integer> result){
        if (node == null){
            return;
        }
        result.add(node.val);
        preorderRecursive(node.left, result);
        preorderRecursive(node.right, result);
    }

    public List<Integer> preorderRecursive() {
        // exercise
        List<Integer> result = new ArrayList<>();
        preorderRecursive(root, result);
        return result;
    }

    public List<Integer> preorderIterative() {
        // exercise
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        if (root == null){
            return null;
        }
        stack.add(root);                        // add first node
        while (!stack.isEmpty()){               // while loop
            TreeNode node = stack.pop();        // pop
            result.add(node.val);
            if (node.right != null){            // push left
                stack.push(node.right);
            }
            if (node.left != null){             // push left
                stack.push(node.left);
            }
        }
        return result;
    }
    private void inorderRecursive(TreeNode node, List<Integer> result){
        if (node == null){
            return;
        }
        inorderRecursive(node.left, result);
        result.add(node.val);
        inorderRecursive(node.right,result);
    }

    public List<Integer> inorderRecursive() {
        // exercise
        List<Integer> result = new ArrayList<>();
        inorderRecursive(root, result);
        return result;
    }

    List<Integer> postorderRecursive() {
        // exercise
        return Arrays.asList(1);
    }
    private int height(TreeNode node){
        if (node == null){
            return 0;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
        // return Math.max(height(node.left), height(node.right)) + 1; <-- compressed return
    }

    public int height() {
        // exercise
        return height(root);
    }

    public int LCA_BST(int v1, int v2) {
        // exercise
        return 0;
    }
}
