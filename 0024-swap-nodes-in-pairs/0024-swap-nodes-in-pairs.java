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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){return head;}
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode prev = null;
        ListNode curr = head;
        int c = 0;
        while(c <= 2 && curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            c++;
            if(c == 2){
                temp.next = prev;
                prev = null;
                c = 0;
                temp = temp.next.next;
            }
        }
        temp.next = prev;
        return dummy.next;

    }
}