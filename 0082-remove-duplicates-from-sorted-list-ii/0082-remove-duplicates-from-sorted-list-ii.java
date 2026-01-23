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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){return head;}
        ListNode dum = new ListNode(-1);
        dum.next = head;
        ListNode i = dum;
        ListNode j = head; // start from head
        while(j != null){ // jabtaj j null nhi ho jata tan tak
            boolean dupPresent = false; //let duplicate present if false.
            
        while(j.next != null && j.val == j.next.val){ // if j ka val = next j.val , means dup present
            dupPresent = true; // duplicate present become true.
            j = j.next; // may be next also be same so j = j.next
        }
         if(dupPresent){ // is dupPresent is true
            i.next = j.next; // i k next node me j ka next node append 
        }else { // or dupPresen is false so i = i.next
            i = i.next;
        }
        j = j.next; // j toh badhega hi chahe true ho ya false.
        }
       
        return dum.next;
    }
}