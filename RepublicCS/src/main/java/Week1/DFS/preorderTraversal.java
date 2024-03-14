//package main.java.Week1.DFS;
//// E 144 Binary Tree Preorder Traversal
//import javax.swing.tree.TreeNode;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Definition for a binary tree node.
// * public class TreeNode {
// *     int val;
// *     TreeNode left;
// *     TreeNode right;
// *     TreeNode() {}
// *     TreeNode(int val) { this.val = val; }
// *     TreeNode(int val, TreeNode left, TreeNode right) {
// *         this.val = val;
// *         this.left = left;
// *         this.right = right;
// *     }
// * }
// */
//class preorderTraversal {
//    public List<Integer> Traversal(TreeNode root, List<Integer> arr){
//        if(root!=null){
//            int data = root.val;
//            arr.add(data);
//            Traversal(root.left,arr);
//            Traversal(root.right,arr);
//        }
//        return arr;
//    }
//
//    public List<Integer> preorderTraversal(TreeNode root) {
//        ArrayList<Integer> arr = new ArrayList<>();
//        return Traversal(root,arr);
//    }
//}