/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */

/*
func preorderTraversal(root *TreeNode) (ret []int) {

	var helper func(root *TreeNode)

	helper = func(cur *TreeNode) {

		if cur != nil {
			ret = append(ret, cur.Val)
			helper(cur.Left)
			helper(cur.Right)
		}
	}

	helper(root)
	return
}
*/

func preorderTraversal(root *TreeNode) (ret []int) {
	if root == nil {
		return
	}

	stack := []*TreeNode{root}

	for len(stack) != 0 {
		pop := stack[len(stack)-1]
		stack = stack[:len(stack)-1]

		ret = append(ret, pop.Val)

		if right := pop.Right; right != nil {
			stack = append(stack, right)
		}

		if left := pop.Left; left != nil {
			stack = append(stack, left)
		}
	}

	return
}
