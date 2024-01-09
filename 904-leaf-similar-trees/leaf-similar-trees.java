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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        leaf(root1,a);
        leaf(root2,b);
        return a.equals(b);
    }
      private void leaf(TreeNode root1, ArrayList<Integer> a)
        {
            if(root1==null)
            {
                return;
            }
            if(root1.left==null && root1.right==null)
            {
                a.add(root1.val);
                return;
            }
            if(root1.left!=null)
            {
            leaf(root1.left,a);
            }
            if(root1.right!=null)
            {
            leaf(root1.right,a);
            }
        }
}