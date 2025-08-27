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
    public  ListNode reverse( ListNode head){
        ListNode prev=null, curr= head;
        while(curr != null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       l1= reverse(l1);
        l2= reverse(l2);
        ListNode dummy=new ListNode();
        ListNode curr=dummy;
    int carry=0;
        while(l1 != null || l2 != null || carry !=0){

            int x=0;
            int y=0;
            if(l1 != null){
                x=l1.val;
                l1=l1.next;
            }
            if(l2 != null){
                y=l2.val;
                l2=l2.next;
            }
            int sum=x+y+carry;
              int digit=sum % 10;
                  carry=sum/10;
        //  ListNode curr=new ListNode(sum);
        curr.next=new ListNode(digit);
        curr=curr.next;

        }
         return reverse(dummy.next);
    }
}