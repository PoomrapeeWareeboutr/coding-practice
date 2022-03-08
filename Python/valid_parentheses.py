class Solution:
    
    def isValid(self, s: str) -> bool:
        
        stack = []
        opening = "({["
        closing = ")}]"
        
        for char in s:
            if char in opening:
                stack.append(char)
            elif char in closing:
                if len(stack) == 0:
                    return False
                elif closing.index(char) != opening.index(stack.pop()):
                    return False 

        return len(stack) == 0
