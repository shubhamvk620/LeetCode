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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null){ return l1;}
        ListNode k = new ListNode(0);
        ListNode temp = k;
        ListNode i = l1;
        ListNode j = l2;
        int c = 0;

        while(i != null && j != null){
            if((i.val + j.val + c) < 10){
                temp.next = new ListNode(i.val + j.val + c);
                c = 0;
            }else{
                 temp.next = new ListNode((i.val + j.val + c) % 10);
                 c = ((i.val + j.val + c) / 10);
            }
             i = i.next;
                j = j.next;
                 temp = temp.next;    
        }
       while( i != null){
         temp.next = new ListNode((i.val+c)%10);
         c = (i.val+c)/10;
          i = i.next;
           temp = temp.next;  
       }  while( j != null){
         temp.next = new ListNode((j.val+c)%10);
         c = (j.val+c)/10;
          j = j.next;
           temp = temp.next;  
       }
        if( (i== null && c != 0) || (j == null && c != 0)){
            temp.next = new ListNode(c);
        }
        return k.next;
    }
}