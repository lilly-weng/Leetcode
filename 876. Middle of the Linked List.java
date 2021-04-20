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
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;   
    }
}

/*
快慢指針
快指針往前走兩步
慢指針往前走一步
當快指針走到最後一個的時候，慢指針已經走到中間值
如果是偶數數字的話
因為 fast.next != null 所以 while 迴圈會再跑最後一次
此時 slow 會到後面那一個
*/
