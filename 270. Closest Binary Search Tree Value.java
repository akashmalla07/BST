/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// TC is O(logn) -> as we are only traversing the 1 side of the tree
// SC is O(1) -> as we are only traversing
class Solution {
    public int closestValue(TreeNode root, double target) {
        int res = root.val;
        //checking for the termination condition
        while(root!=null){
            //finding the closed root value by taking only the absolute values
            if(Math.abs(target-root.val) < Math.abs(target-res))  
            res =  root.val;
            // as we know the inorder of bst is sorted
            // so correct move either to left or right side of the bst
             if(target < root.val){
                root = root.left;
            }else{
                root = root.right;
            }
        }
        return res;
    }
}