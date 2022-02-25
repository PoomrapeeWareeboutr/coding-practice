'''
LeetCode's Problem
# 704 - Binary Search - Easy
'''

class Solution:
    def search(self, nums, target) -> int:
        
        low = 0
        high = len(nums) - 1
        
        while low <= high:
            mid = (high + low)//2
            if nums[mid] == target:
                return mid
            elif nums[mid] > target:
                high = mid - 1
            elif nums[mid] < target:
                low = mid + 1
        
        return -1

if __name__ == "__main__":
    
    nums = [-1,0,3,5,9,12]
    target = 9
    ans_1 = Solution()
    print(ans_1.search(nums, target))

    nums = [-1,0,3,5,9,12]
    target = 1
    ans_2 = Solution()
    print(ans_2.search(nums, target))