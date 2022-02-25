'''
LeetCode's Problem
# 1417 - Reformat The String - Easy
'''

import string

class Solution:
    def concatenateString(self, list1, list2):
        ans = ""
        i = j = k = 0
        n = len(list1) + len(list2)
        while i < n:
            if i%2 == 0:
                if j < len(list1)-1:
                    ans += list1[j]
                    j += 1
                elif j == len(list1)-1:
                    ans += list1[j]
                else:
                    j += 1
            elif i%2 != 0:
                if k < len(list2)-1:
                    ans += list2[k]
                    k += 1
                elif k == len(list2)-1:
                    ans += list2[k]
                else:
                    k += 1
            i += 1
        return ans

    def reformat(self, s: str) -> str:
        ans = ""
        if len(s) == 1:
            return s
        elif s.isalpha() is True:
            return ans
        elif s.isdigit() is True:
            return ans
        
        str_list = list(s)
        constant_alpha = string.ascii_lowercase
        constant_digit = ["0","1","2","3","4","5","6","7","8","9"]
        
        alpha_list = []
        digit_list = []
        i = 0
        while i < len(str_list):
            if str_list[i] in constant_alpha:
                alpha_list.append(str_list[i])
            
            elif str_list[i] in constant_digit:
                digit_list.append(str_list[i])
            i += 1
        
        if len(alpha_list) > len(digit_list):
            ans = self.concatenateString(alpha_list, digit_list)
        elif len(digit_list) > len(alpha_list):
            ans = self.concatenateString(digit_list, alpha_list)
        else:
            ans = self.concatenateString(digit_list, alpha_list)

        return ans

if __name__ == "__main__":
    s = "a0b1c2"
    ans_1 = Solution()
    print("Test case #1: " + s)
    print("New format: " + ans_1.reformat(s))

    s = "covid2019"
    ans_2 = Solution()
    print("Test case #2: " + s)
    print("New format: " + ans_2.reformat(s))

    s = "ab123"
    ans_3 = Solution()
    print("Test case #3: " + s)
    print("New format: " + ans_3.reformat(s))