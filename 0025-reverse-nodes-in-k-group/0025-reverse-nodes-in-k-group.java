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
            prev = curr; // all reversing is saving in prev
            curr = next; // reversing node until k count.
            count ++;
           if(count == k){ // is count == k, means k tak reverse ho chuka hai & prev me rakh hai wo reverse nodes.
            temp.next = prev; // prev ko temp.next me daal dena hai
            prev = null; // make prev null again;
            count = 0; // make count 0 again.
           }
           if(count == 0){// count = 0 means reverse done & prev append in next of temp
            while(temp.next != null){ // move temp to last node again means before null so to append next reverse nodes.
                temp = temp.next;
            }
           }
        } 
        // loop for reversing those nodes that are less that k and got reversed and stayed in prev.
         ListNode prev1 = null;
        ListNode curr2 = prev;
        while(curr2!=null){
            ListNode next2 = curr2.next;
            curr2.next = prev1;
            prev1 = curr2;
            curr2 = next2;
        }
        // after reversing left reversed nodes,& add them next to temp.
        temp.next = prev1;
        return dummy.next;
    }
}