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
        int count = 0;
        ListNode ans = head;
        
        while(ans!=null){
            ans = ans.next;
            count++;
        }
        for(int i=0; i<(count/2); i++){
            head=head.next;
        }
        return head;
    }
}