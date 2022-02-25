'''
LeetCode's Problem
# 392 - Is Subsequence - Easy
'''

class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        s_list = list(s)
        t_list = list(t)
        
        c = 0
        for char in s_list:
            if char in t_list:
                c += 1
        
        if c == len(s_list):
            new_s = ""
            new_t = ""
            for char in s_list:
                new_s += char
            for char in t_list:
                if char in s_list:
                    new_t += char
            
            if new_s == new_t:
                return True
            elif len(new_s) <= len(new_t):
                new_s += "*"
                new_t += "*"
                
                ans_1 = ""
                ans_2 = ""
                i = 0
                while i < len(new_s)-1:
                    if new_s[i] != new_s[i+1]:
                        ans_1 += new_s[i]
                    i += 1
                i = 0
                while i < len(new_t)-1:
                    if new_t[i] != new_t[i+1]:
                        ans_2 += new_t[i]
                    i += 1
                
                if ans_1 == ans_2:
                    return True
                else:
                    return False
            else:
                return False
        else:
            return False

if __name__ == "__main__":
    s = "abc"
    t = "ahbgdc"
    ans_1 = Solution()
    print(ans_1.isSubsequence(s, t))

    s = "axc"
    t = "ahbgdc"
    ans_2 = Solution()
    print(ans_2.isSubsequence(s, t))