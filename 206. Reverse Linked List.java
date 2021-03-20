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
        if (head == null || head.next == null) return head;
        
        //先創建三個指針
        ListNode cur = head; //指向head
        ListNode prev = null; //指向null
        ListNode next = cur.next; //指向cur的下一個Node
        
        while(cur != null) {
            cur.next = prev; //斷開連結，讓cur的next指向prev，這樣cur這個Node會連到prev的前面(左邊)
            prev = cur;//prev 往左移一格
            cur = next; //cur 回到原本的Linked List
            if (cur != null){ //因為cur往前移了，需要判斷是不是null
                next = cur.next; //next往前移一格
            }
        }
        return prev;
    }
}
