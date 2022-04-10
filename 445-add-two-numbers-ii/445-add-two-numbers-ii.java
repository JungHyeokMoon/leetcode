/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1=new Stack<>();
        Stack<Integer> stack2=new Stack<>();
        
        while(l1!=null){
            stack1.add(l1.val);
            l1=l1.next;
        }
        
        while(l2!=null){
            stack2.add(l2.val);
            l2=l2.next;
        }
        
        int carry=0;
        ListNode dummy=new ListNode(-1);
        ListNode p=dummy;
        
        while(!stack1.empty() || !stack2.empty() || carry!=0){
        
            if(!stack1.empty()){
                carry+=stack1.pop();
            }
            
            if(!stack2.empty()){
                carry+=stack2.pop();
            }
            
            p.next=new ListNode(carry%10);
            carry/=10;
            p=p.next;
        }
        
        return reverse(dummy.next);
    }
    
    private ListNode reverse(ListNode cur){
        ListNode prev=null;
        while(cur!=null){
            // System.out.println(cur.val);
            ListNode temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }
}