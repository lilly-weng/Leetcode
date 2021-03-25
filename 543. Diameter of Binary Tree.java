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
class Solution {
    
     //定義一個全域的變數
    int diameter = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        getDepth(root);
        return diameter;
    }
    
    private int getDepth(TreeNode root) {
        //base case
        if (root == null) return 0;
        
        //先遍歷左邊，再遍歷右邊
        int l = getDepth(root.left);
        int r = getDepth(root.right);
        
        //更新diameter
        diameter = Math.max(diameter, l+r);
        
        //往上一層要加一
        return Math.max(l,r)+1;
        
    }
    
}
