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
        int temp = 0;
        int sum;
        ListNode node = new ListNode();
        if(l1.val == 0 && l2.val == 0 && l1.next == null && l2.next == null) {
            return new ListNode(0);        
        } else {      
            ListNode nNode = node;              
            while (l1 != null || l2 != null) {
                int val1 = l1 != null ? l1.val : 0;
                int val2 = l2 != null ? l2.val : 0;
                sum = val1 + val2 + temp;
                temp = sum > 9 ? 1 : 0;
                ListNode newNode = new ListNode(sum % 10);
                nNode.next = newNode;
                nNode = newNode;
                if (l1 != null) {
                    l1 = l1.next;
                } 
                if (l2 != null) {
                    l2 = l2.next;
                }
                
                
                
                
                
            }
            if (temp == 1) {
                nNode.next = new ListNode(1);
            }
        }
        return node.next;
    }      
}
