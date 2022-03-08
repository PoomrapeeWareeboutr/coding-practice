class Solution:
  
    def zigzagLevelOrder(self, root: TreeNode) -> List[List[int]]:
        if not root:
            return None
        
        res = []
        h = self.height(root)
        for level in range(h):
            temp = []
            self.bfs(root, level, level % 2 == 0, temp)
            res.append(temp)
        return res

    def bfs(self, root: TreeNode, level: int, isEvenLevel: bool, list: List[int]) -> None:
        if not root:
            return
        
        if level == 0:
            list.append(root.val)
        else:
            if isEvenLevel:
                self.bfs(root.left, level - 1, isEvenLevel, list)
                self.bfs(root.right, level - 1, isEvenLevel, list)
            else:
                self.bfs(root.right, level - 1, isEvenLevel, list)
                self.bfs(root.left, level - 1, isEvenLevel, list)

    def height(self, root: TreeNode) -> int:
        if not root:
            return 0
        return 1 + max(self.height(root.left), self.height(root.right))
     
    
