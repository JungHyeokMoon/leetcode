/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */

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