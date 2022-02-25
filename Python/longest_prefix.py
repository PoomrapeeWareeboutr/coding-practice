'''
Leetcode's Problem
# 14 - Longest Common Prefix - Easy
'''
import string

class Solution:
    def longestCommonPrefix(self, strs) -> str:
        
        prefix = ""
        if len(strs) == 0:
            return prefix

        min_length = len(strs[0])
        for word in strs:
            if len(word) < min_length:
                min_length = len(word)
        
        temp_set = set()
        i = 0
        while i < min_length:
            j = 0
            temp_set.clear()
            while j < len(strs):
                temp_set.add(strs[j][i])
                j += 1
            if len(temp_set) != 1:
                break
            else:
                temp_list = list(temp_set)
                prefix += temp_list[0]
            i += 1
        
        return prefix
            
if __name__ == "__main__":
    strs1 = ["flower","flow","flight"]
    strs2 = ["Annie", "Anna", "Andy"]
    strs3 = ["Muffy", "Merk", "Mark"]
    ans_1 = Solution()
    ans_2 = Solution()
    ans_3 = Solution()
    print(ans_1.longestCommonPrefix(strs1))
    print(ans_1.longestCommonPrefix(strs2))
    print(ans_1.longestCommonPrefix(strs3))