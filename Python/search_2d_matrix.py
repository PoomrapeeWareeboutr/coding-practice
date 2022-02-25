'''
LeetCode's Problem
# 74 - Search a 2D Matrix - Easy
'''

class Solution:
    def searchMatrix(self, matrix, target) -> bool:
        
        for row in matrix:
            low = 0
            high = len(row) - 1
            while low <= high:
                mid = (high + low)//2
                if row[mid] == target:
                    return True
                elif row[mid] > target:
                    high = mid - 1
                elif row[mid] < target:
                    low = mid + 1
                    
        return False

if __name__ == "__main__":
    
    matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]]
    target = 3
    ans_1 = Solution()
    print(ans_1.searchMatrix(matrix, target))