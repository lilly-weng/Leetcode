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
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p = dummy; //指針指向 dummy
        
        while (p.next != null) { //遍歷到倒數第二個，因為下面有一個 p = p.next
            if (p.next.val == val) { // 如果 p 的下一個值是 val
                p.next = p.next.next; // 就跳過到下下個值
            } else {
                p = p.next; //如果不是，p 就往前走一位
            }
        }
        
        return dummy.next;
        
    }
}
