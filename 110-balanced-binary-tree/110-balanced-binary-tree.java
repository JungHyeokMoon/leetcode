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
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        
        int leftHeight=getHeight(root.left);
        int rightHeight=getHeight(root.right);
        if(Math.abs(leftHeight-rightHeight)>1)return false;
        
        boolean flag=true;
        flag=flag && isBalanced(root.left) && isBalanced(root.right);
        return flag;
    }
    
    private int getHeight(TreeNode cur){
        if(cur==null){
            return 0;
        }
        
        int curHeight=1;
        int plusHeight=Math.max(getHeight(cur.left), getHeight(cur.right));
        return curHeight+plusHeight;
    }
}