'''
Leetcode's Problem
# 278 - First Bad Version - Easy
'''
class Solution:
    def __init__(self, bad):
        self.bad = bad

    def isBadVersion(self, mid):
        if mid >= self.bad:
            return True
        else:
            return False
    
    def firstBadVersion(self, n):
        leftIndex = 1
        rightIndex = n
        while leftIndex <= rightIndex:
            mid = (leftIndex + rightIndex)//2
            if self.isBadVersion(mid) is True:
                rightIndex = mid - 1
            else:
                leftIndex = mid + 1
                
        return leftIndex

if __name__ == "__main__":
    n, bad = map(int, input().split())

    ans_1 = Solution(bad)
    print(ans_1.firstBadVersion(n))