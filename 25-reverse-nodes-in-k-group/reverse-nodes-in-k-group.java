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
        if(head==null)
         return null;
         ListNode tail=head;
          for(int i=0;i<k;i++){
            if(tail==null)
                return head;
                tail=tail.next;
               }
             ListNode dummy=reverse(head,tail);
            head.next=reverseKGroup( tail,k);
             return dummy;
    }
            public ListNode reverse(ListNode curr,ListNode end){
                ListNode prev=null;//curr=head;
                while(curr != end){
                    ListNode temp=curr.next;
                    curr.next=prev;
                    prev=curr;
                    curr=temp;
                }
         return prev;

            
    }
}