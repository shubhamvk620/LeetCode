/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
/* we have given exact pointer, which we have to delete in this ques.
so if we put next node's value in the that node which we have to delete
and after that we connect current pointer/node to next.next means skip copy then automatically
size decrease by 1 and node we get ans.*/
