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
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    int ans = 0;
    public int maxAncestorDiff(TreeNode root) {
        maxDiffAncesstor(root, root.val, root.val);
        return ans;
    }

    public void maxDiffAncesstor(TreeNode root, int min, int max){
        if(root != null){
            int val = root.val;
            ans = Math.max(ans, Math.max(Math.abs(val - min), Math.abs(val - max)));
            min = Math.min(val, min);
            max = Math.max(val, max);
            maxDiffAncesstor(root.left, min, max);
            maxDiffAncesstor(root.right,min, max);
        }
    }
}