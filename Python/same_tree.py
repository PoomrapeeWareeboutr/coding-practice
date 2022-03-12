class Solution {
    boolean isSame = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        levelOrderTraversal(p, q);
        return isSame;
    }

    public void levelOrderTraversal(TreeNode p, TreeNode q) {
        int pHeight = getHeight(p), qHeight = getHeight(q);
        if(pHeight != qHeight) {
            isSame = false;
            return;
        }
        for(int i = 0; i < pHeight; i++) {
            compareVal(p, q, i);
        }
    }

    public void compareVal(TreeNode p, TreeNode q, int level) {
        if(p == null) {
            if(q != null) isSame = false;
            return;
        }

        if(level == 0) {
            int l = p.val, r = 0;
            if(q != null) r = q.val;
            if(l != r) isSame = false;
        } else {
            if(q.left != null) {
                compareVal(p.left, q.left, level - 1);
            } else { 
                if(p.left != null) isSame = false;
            }
            if(q.right != null) {
                compareVal(p.right, q.right, level - 1);
            } else {
                if(p.right != null) isSame = false;
            }
        }
    }

    public int getHeight(TreeNode root) {
        if(root == null) return 0;
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }
}
