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
class Solution {
    int depth=1;
    void maxdepth(TreeNode root,int d){
         if(root==null) return ;
         if(depth<d) depth=d;
         maxdepth(root.left,d+1);
         maxdepth(root.right,d+1);
    }
    public int maxDepth(TreeNode root){
        if(root==null) return 0;
        maxdepth(root,1);
        return depth;
    }
}