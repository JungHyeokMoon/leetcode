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
    public int getDecimalValue(ListNode head) {
        int answer=0;
        
        for(ListNode cur=head; cur!=null; cur=cur.next){
            answer=answer<<1;
            answer+=cur.val;    
        }
        return answer;
        
    }
}