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
        return helper(l1,l2,0);
    }
    private ListNode helper(ListNode l1, ListNode l2, int carry){
        if(l1 == null && l2 == null){
            if(carry == 1)  return new ListNode(1);
            else    return null;
        }
        
        int sum = carry;
        sum = (l1 == null)?sum:sum+l1.val;
        sum = (l2 == null)?sum:sum+l2.val;
        
        carry = sum / 10;
        sum = sum % 10;
        
        ListNode node = new ListNode(sum);
        if(l1 == null)  
            node.next = helper(l1,l2.next,carry);
        else if(l2 == null)
            node.next = helper(l1.next,l2,carry);
        else
            node.next = helper(l1.next,l2.next,carry);
        return node;
        
    }
}