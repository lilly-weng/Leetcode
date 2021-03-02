/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(root!=null){
            if (root.val > p.val && root.val > q.val) //兩個值都在左邊，則在LCA左邊
                root = root.left;
            else if (root.val < p.val && root.val < q.val) //兩個值都在右邊，則在LCA右邊
                root =root.right;
            else 
                return root;        
        }
        return root;
    }
}
