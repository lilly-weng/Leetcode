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
    class NodeComparator implements Comparator<ListNode> {
            @Override
            public int compare(ListNode a, ListNode b){
                return a.val - b.val; // 可以找到最小值
            }
        }
        
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0);
        if (lists == null || lists.length == 0) return dummy.next;
        ListNode current = dummy;
        int size = lists.length;
        NodeComparator cmp = new NodeComparator();
        PriorityQueue <ListNode> pqueue = new PriorityQueue(cmp);
        for (int i = 0; i<size; i++){
            System.out.println(lists[i]);
            if (lists[i] != null) {
                pqueue.add(lists[i]);   //將首節點加入pqueue中           
            }
        }
        while (pqueue.size() != 0) {
            ListNode node = pqueue.poll(); //poll出來的節點(根據comparator的規則，poll出最小值)
            current.next = node; //current 指針移到poll出來的節點
            current = current.next; //移動current 指針到那個節點
            if (node.next != null) pqueue.add(node.next); //加入poll出來的節點的下一個節點
        }
        
        return dummy.next;
        
    }
}
