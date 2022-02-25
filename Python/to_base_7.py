'''
LeetCode's Problem
# 504 - Base 7 - Easy
'''

class Solution:
    def convertToBase7(self, num: int) -> str:
        ans = ""
        if num > 0:
            while num != 0:
                pop = num % 7
                num //= 7
                ans += str(pop)
            return ans[::-1]
        elif num < 0:
            num *= -1
            while num != 0:
                pop = num % 7
                num //= 7
                ans += str(pop)
            ans += "-"
            return ans[::-1]
        else:
            ans = "0"
            return ans

if __name__ == "__main__":
    num = int(input())
    ans_1 = Solution()
    print(ans_1.convertToBase7(num))