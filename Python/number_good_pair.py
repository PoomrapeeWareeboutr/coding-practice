'''
LeetCode's Problem
# 1512 - Number of Good Pairs - Easy
'''

class Solution:
    def numIdenticalPairs(self, nums) -> int:
        ans_set = set()

        i = 0
        while i < len(nums):
            j = 0
            while j < len(nums):
                if i < j and nums[i] == nums[j]:
                    ans_set.add((i, j))
                j+=1    
            i+=1
        
        return len(ans_set)

if __name__ == "__main__":
   
    nums = [1,2,3,1,1,3]
    ans_1 = Solution()
    print(ans_1.numIdenticalPairs(nums))