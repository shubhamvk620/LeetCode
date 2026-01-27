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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null && n == 1){return null;}
         ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = dummy;
        ListNode slow = dummy;
        int c = 1;
        while(slow.next != null){
            slow = slow.next;
            c++;
        }
        int i = 1; 
        int k = c-n; 
       while(i < k){
        temp = temp.next;
        i++;
       }
       temp.next = temp.next.next;
        return dummy.next;
       
    }
}