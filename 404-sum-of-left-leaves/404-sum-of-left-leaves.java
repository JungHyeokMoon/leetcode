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
    public int sumOfLeftLeaves(TreeNode root) {
        return helper(root,false);
    }
    
    private int helper(TreeNode cur, boolean isLeft){
        if(cur==null){
            return 0;
        }
        
        if(cur.left==null && cur.right==null){
            if(isLeft){
                return cur.val;
            }
            else{
                return 0;
            }
        }
        int sum=0;
        sum+=helper(cur.left,true);
        sum+=helper(cur.right,false);
        return sum;
    }
}