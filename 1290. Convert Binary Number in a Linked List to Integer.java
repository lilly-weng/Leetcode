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
    public int getDecimalValue(ListNode head) {
        ListNode cur = head;
        int ans = 0;
        while (cur != null) {
            ans <<= 1; //左移1位
            ans += cur.val;
            cur = cur.next;
        }
        return ans;
    }
}

/*
ans = 0
左移一位: 00
加上value: 00+1 = 01

左移一位: 010
加上value: 010+0 = 010

左移一位: 0100
加上value: 0100+1 = 0101

0101的十進位是 5

*/
