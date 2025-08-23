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
        public ListNode reverseList(ListNode head) {
        
        ListNode prev=null; //prevease element of head
        ListNode curr=head; //consider current element is head

        while(curr!=null){// head is check is null or not null
        ListNode next=curr.next;
            curr.next=prev;//  consider current elemtn is null but head is null or 
           
             prev=curr;
            curr=next;
            //  head=prev;

        }
            return prev;
        }
    }