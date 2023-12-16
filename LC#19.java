19. Remove Nth Node From End of List
Given the head of a linked list, remove the nth node from the end of the list and return its head.
  =========sol========
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
//   the basic approach is to count the  elements and find nth node from back
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow,fast;
        slow=fast=head;
        while(n--!=0){
          fast=fast.next;
        }
        if(fast==null)
         return slow.next;
        else{
          while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
          }
          slow.next=slow.next.next;
        }
        
        return head;
    }
}
