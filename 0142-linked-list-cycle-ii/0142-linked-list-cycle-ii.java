/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean isCycle = false; 

        while(fast != null && fast.next != null){ // loop for checking presence of list cycle
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){ // if cycle present
                isCycle = true; //isCycle become true means cycle present
                break; // break loop so to save position of slow and fast.
            }
        }
         if(isCycle == false){ // agar isCycle abhi tak false hai means cycle nhi mila to return null.
            return null;
         }
         //or agar isCycle true ho gaya hai then 
         slow = head; // initialize slow to head.
         while(slow != fast){
            slow = slow.next;
            fast = fast.next;
         }
         return slow; //jis positiom pe slow = fast hota hai usi position ko return maar do either slow or fast;
    }
}