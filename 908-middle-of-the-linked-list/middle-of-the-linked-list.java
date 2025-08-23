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
    public ListNode middleNode(ListNode head) {
        //head check null
        if(head==null){
            return null;
        }

         ListNode fast=head;//2X fast
         ListNode slow=head; //1X slow compare 2x 

      //check fast is not null and fast.next is null
      while(fast!=null && fast.next!=null){

        fast=fast.next.next;// 2x speed
        slow= slow.next;
      }       
      return slow;
    }
}