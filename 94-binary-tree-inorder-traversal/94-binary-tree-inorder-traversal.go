/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */

/*
func inorderTraversal(root *TreeNode) (ret []int) {
    
    var helper func(cur *TreeNode)
    
    helper= func(cur *TreeNode){
        if cur!=nil{
            helper(cur.Left)
            ret=append(ret,cur.Val)
            helper(cur.Right)
        }
    }
    
    helper(root)
    return 
}
*/

func inorderTraversal(root *TreeNode) (ret []int) {

	stack := []*TreeNode{}
	cur := root

	for cur != nil || len(stack) != 0 {

		for cur != nil {
			stack = append(stack, cur)
			cur = cur.Left
		}

		pop := stack[len(stack)-1]
		stack = stack[:len(stack)-1]
		ret = append(ret, pop.Val)

		cur = pop.Right
	}

	return
}
