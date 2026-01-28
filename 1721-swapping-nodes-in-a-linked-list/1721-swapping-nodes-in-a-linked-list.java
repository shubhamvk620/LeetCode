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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int l = 0;
        while(temp != null){
            temp = temp.next;
            l++;
        }
        ListNode slow = head;
        for(int i = 1; i < k; i++){
            slow = slow.next;
        }
        int length = l+1-k;
        ListNode fast = head;
        for(int j = 1; j < length; j++){
            fast = fast.next;
        }
        int tem = slow.val;
        slow.val = fast.val;
        fast.val = tem;
        return head;
    }
}