'''
Leetcode's Problem
# 125 - Valid Palindrome - Easy
'''
class Solution:
    def isPalindrome(self, s: str) -> bool:
        if s == "":
            return True
        
        lower_string = s.lower()
        ans = ""
        for char in lower_string:
            if (char >= 'a' and char <= 'z') or (char >= '0' and char <= '9'):
                ans += char

        if ans == ans[::-1]:
            return True
        else:
            return False

if __name__ == "__main__":
    
    s1 = "A man, a plan, a canal: Panama" 
    s2 = "race a car"
    ans_1 = Solution()
    ans_2 = Solution()
    print(ans_1.isPalindrome(s1))
    print(ans_1.isPalindrome(s2))