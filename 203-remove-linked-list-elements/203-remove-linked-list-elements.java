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
    public ListNode removeElements(ListNode head, int val) {
       ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode prev = dummy;
		ListNode curr = dummy.next;
		while(curr!=null){
			while(curr!=null && curr.val==val){
				prev.next = curr.next;
				curr=curr.next;

			}
			prev = prev.next;
			if(curr!=null)
				curr=curr.next;
		}
		return dummy.next; 
    }
}