/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
/*
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
*/
func postorderTraversal(root *TreeNode) (ret []int) {

	stack := []*TreeNode{}
	cur := root

	for cur != nil || len(stack) != 0 {

		for cur != nil {
			ret = append(ret, cur.Val)
			stack = append(stack, cur)
			cur = cur.Right
		}

		pop := stack[len(stack)-1]
		stack = stack[:len(stack)-1]
		cur = pop.Left
	}

    //preorder Right를 뒤집기
	for i, j := 0, len(ret)-1; i < j; i, j = i+1, j-1 {
		ret[i], ret[j] = ret[j], ret[i]
	}

	return
}