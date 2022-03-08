class Solution {

    int leftmostVal;
    boolean isFound = false;

    public int findBottomLeftValue(TreeNode root) {
        if(root == null) return 0;
        leftmostVal = root.val;
        traverse(root, height(root) - 1);

        return leftmostVal;
    }

    public void traverse(TreeNode root, int level) {
        if(root == null) return;
        if(level == 0) {
            if(!isFound) {
                leftmostVal = root.val;
                isFound = true;
            }
        }
        traverse(root.left, level - 1);
        traverse(root.right, level - 1);
    }
    
    public int height(TreeNode root) {
        if(root == null) return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }


}
