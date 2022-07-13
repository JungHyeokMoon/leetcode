/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func middleNode(head *ListNode) *ListNode {
	slow, fast := head, head.Next

	for ; fast != nil && fast.Next != nil; slow, fast = slow.Next, fast.Next.Next {

	}
	
    if fast==nil{
        return slow
    }
    return slow.Next
}