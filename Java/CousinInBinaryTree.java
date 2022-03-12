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

    TreeNode pX = null;
    TreeNode pY = null;
    int levelX = 0;
    int levelY = 0;

    public boolean isCousins(TreeNode root, int x, int y) {

        int h = height(root);
        for(int i = 0; i < h; i++) {
            bfs(root, root, root, x, y, i, i);
        }
        if(levelX != levelY) return false;
        return !pX.equals(pY);
    }

    public void bfs(TreeNode root, TreeNode tempPX, TreeNode tempPY, int x, int y, int currentLevel, int level) {
        if(root == null) return;

        if(currentLevel == 0) {
            if(root.val == x) {
                pX = tempPX;
                levelX = level;
            }
            if(root.val == y) {
                pY = tempPY;
                levelY = level;
            }
        }
        bfs(root.left, root, root, x, y, currentLevel - 1, level);
        bfs(root.right, root, root, x, y, currentLevel - 1, level);
    }

    public int height(TreeNode root) {
        if(root == null) return 0;
        int l = height(root.left), r = height(root.right);
        if(l > r) return l + 1;
        return r + 1;
    }

}
