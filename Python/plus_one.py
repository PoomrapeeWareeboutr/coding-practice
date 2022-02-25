'''
LeetCode's Problem
# 66 - Plus One - Easy
'''
class Solution:
    def plusOne(self, digits):
        ans = []
        i = 0
        sum = 0
        while i < len(digits):
            pop = digits[i]
            sum = (sum * 10) + pop
            i += 1
        
        sum += 1
        while sum != 0:
            pop = sum % 10
            sum //= 10
            ans.append(pop)
        
        n = 0
        if len(ans) < len(digits):
            n = len(digits) - len(ans)
            while n != 0:
                ans.append(0)
                n -= 1
        
        ans.reverse()
        return ans

if __name__ == "__main__":
    
    digits = [9]
    ans_1 = Solution()
    print(ans_1.plusOne(digits))

    digits = [1,2,3]
    ans_2 = Solution()
    print(ans_1.plusOne(digits))
    
    digits = [4,3,2,1]
    ans_3 = Solution()
    print(ans_1.plusOne(digits))

