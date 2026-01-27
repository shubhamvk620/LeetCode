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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prev = null;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode curr = head;
        int count = 0;
        while(count <= k && curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count ++;
           if(count == k){
            temp.next = prev;
            prev = null;
            count = 0;
           }
           if(count == 0){
            while(temp.next != null){
                temp = temp.next;
            }
           }
        }
         ListNode prev1 = null;
        ListNode curr2 = prev;
        while(curr2!=null){
            ListNode next2 = curr2.next;
            curr2.next = prev1;
            prev1 = curr2;
            curr2 = next2;
        }
        temp.next = prev1;
        return dummy.next;
    }
}