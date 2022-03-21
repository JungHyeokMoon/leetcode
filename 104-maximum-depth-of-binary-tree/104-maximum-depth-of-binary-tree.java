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
    public int maxDepth(TreeNode root) {
        return helper(root,0);
    }
    
    private int helper(TreeNode cur, int curDepth){
        if(cur==null){
            return curDepth;
        }
        
        return Math.max(helper(cur.left,curDepth+1), helper(cur.right, curDepth+1));
    }
}