/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

/*
只給了要被刪除的節點
因此讓要被刪除的節點的值 連到 下一個節點的值
要被刪除的節點的下一點 連到 下下個點
*/
