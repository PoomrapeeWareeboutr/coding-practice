class Solution {

    boolean isFound = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        if (root.left == null && root.right == null) {
            if (root.val == targetSum) {
                return true;
            }
        }
        helper(root, targetSum, 0);
        return isFound;
    }
    
    public void helper(TreeNode root, int targetSum, int currentSum) {
        if (root == null) return;
        
        currentSum += root.val;
        if (root.left == null && root.right == null) {
            if (currentSum == targetSum) {
                isFound = true;
            }
        }
        helper(root.left, targetSum, currentSum);
        helper(root.right, targetSum, currentSum);

    }
}
