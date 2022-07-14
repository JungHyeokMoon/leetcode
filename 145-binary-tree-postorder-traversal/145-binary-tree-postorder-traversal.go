/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func postorderTraversal(root *TreeNode) (ret []int) {
    
    var helper func(cur *TreeNode)
    
    helper= func (cur *TreeNode){
        if cur!=nil{
            helper(cur.Left)
            helper(cur.Right)
            ret=append(ret,cur.Val)
        }
    }
    
    helper(root)
    return
}