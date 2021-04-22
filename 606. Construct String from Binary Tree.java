/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

/*
情況一: 沒有子數 --> 可以省略括號
情況二: 只有左子數 --> 可以省略右子數的括號
情況三: 只有右子數 --> 不可省略左邊的括號
情況四: 兩邊都有子數
*/

class Solution {
    public String tree2str(TreeNode t) {
        //corner case
        if (t == null) return "";
        
        //情況一: 兩邊都沒有子數
        if (t.left == null && t.right == null) {
            return t.val+""; // return root value
        }
        //情況二: 只有左子數 --> 可省略
        if (t.right == null) {
            return t.val + "(" + tree2str(t.left) + ")";
        }
        //情況三: 只有右子數 --> 不可省略
        if (t.left == null) {
            return t.val + "()"+"("+tree2str(t.right)+")";
        }
        
        //情況四: 都有
        return t.val +"("+tree2str(t.left)+")"+"("+tree2str(t.right)+")";
    }     
}
