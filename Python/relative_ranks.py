'''
LeetCode's Problem
# 506 - Relative Ranks - Easy
'''

class Solution:
    def findRelativeRanks(self, nums):
        
        ranks = nums.copy()
        ranks.sort()
        ranks.reverse()
        i = 0
        print(nums)
        while i < len(nums):
            j = 0
            while j < len(ranks):
                if nums[i] == ranks[j]:
                    if j == 0:
                        nums.pop(i)
                        nums.insert(i, "Gold Medal")
                    elif j == 1:
                        nums.pop(i)
                        nums.insert(i, "Silver Medal")
                    elif j == 2:
                        nums.pop(i)
                        nums.insert(i, "Bronze Medal")
                    else:
                        nums.pop(i)
                        nums.insert(i, str(j+1))
                j+=1
            i+=1 
        return nums
        
if __name__ == "__main__":

    nums = [5,4,3,2,1]
    ans_1 = Solution()
    print(ans_1.findRelativeRanks(nums))

    nums = [10,3,8,9,4]
    ans_2 = Solution()
    print(ans_2.findRelativeRanks(nums))