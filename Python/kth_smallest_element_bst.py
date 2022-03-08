# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    
    def kthSmallest(self, root: TreeNode, k: int) -> int:
        
        self.k = k
        self.dfs(root)
        return self.kthMin

    def dfs(self, root: TreeNode) -> None:
        if not root:
            return

        self.dfs(root.left)
        if self.k > 0:
            self.kthMin = root.val
            self.k -= 1
            
        self.dfs(root.right)
