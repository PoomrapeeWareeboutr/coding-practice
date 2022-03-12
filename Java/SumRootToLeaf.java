class Solution {

    int totalSum = 0;
    public int sumNumbers(TreeNode root) {
        if(root == null) return 0;
        helper(root, 0);
        return totalSum;

    }

    public void helper(TreeNode root, int currentSum) {
        if(root == null) {
            return;
        }                
        
        currentSum = (currentSum * 10) + root.val;
        if(root.left == null && root.right == null) {
            totalSum += currentSum;
            return;
        }
        helper(root.left, currentSum);
        helper(root.right, currentSum);
    }
}
