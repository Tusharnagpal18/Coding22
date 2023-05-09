You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.
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
 
 -------sol----------
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ln=new ListNode();
        ListNode tail=ln;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                tail.next=list1;
                tail=tail.next;
                list1=list1.next;
            }
            else{
                tail.next=list2;
                tail=tail.next;
                list2=list2.next;
            }
        }
        while(list1!=null){
            tail.next=list1;
            tail=tail.next;
            list1=list1.next;
        }
        while(list2!=null){
            tail.next=list2;
            tail=tail.next;
            list2=list2.next;
        }
        return ln.next;
    }
}
 
