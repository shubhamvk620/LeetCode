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
        int n = 0;
        ListNode dup = head;
        while(dup != null){
            n++;
            dup = dup.next;
        }
        int ans = 0;
        ListNode temp = head;
        while(temp != null){
            if(temp.val == 1){
                ans += Math.pow(2,n-1);
            }
            n--;
            temp = temp.next;
        }
        return ans;
    }
}