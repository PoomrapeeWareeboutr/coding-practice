'''
Leetcode's Problem
# 345 - Reverse Vowels of a String - Easy
'''

class Solution:
    def reverseVowels(self, s: str) -> str:
        vowels = ["a", "e", "i", "o", "u", "A", "E", "I", "O", "U"]
        str_list = list(s)
        rev_list = []

        i = 0
        while i < len(str_list):
            if str_list[i] in vowels:
                rev_list.append(str_list[i])
                str_list[i] = "*"
            i += 1
        
        rev_list.reverse()
        i = 0
        ans = ""
        while i < len(str_list):
            if str_list[i] == '*':
                ans += rev_list[0]
                rev_list.pop(0)
            else:
                ans += str_list[i]
            i += 1

        
        return ans

if __name__ == "__main__":
    s = input()
    ans_1 = Solution()
    print(ans_1.reverseVowels(s))