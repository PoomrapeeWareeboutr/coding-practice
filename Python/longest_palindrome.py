'''
LeetCode's Problem
# 409 - Longest Palindrome - Easy
'''

from collections import Counter

class Solution:
    def longestPalindrome(self, s: str) -> int:
        
        dict_arr = dict(Counter(s))
        ans = 0
        for char in dict_arr:
            if dict_arr[char] % 2 == 0:
                ans += dict_arr[char]
                dict_arr[char] -= dict_arr[char]

            elif (dict_arr[char] > 1) and (dict_arr[char] % 2 == 1):
                ans += dict_arr[char] - 1
                dict_arr[char] = (dict_arr[char] + 1) - (dict_arr[char])
        
        for char in dict_arr:
            if dict_arr[char] == 1:
                ans += 1
                break
        
        return ans

if __name__ == "__main__":
    
    s = "ccc"
    ans_1 = Solution()
    print(ans_1.longestPalindrome(s))

    s = "abccccdd"
    ans_2 = Solution()
    print(ans_2.longestPalindrome(s))