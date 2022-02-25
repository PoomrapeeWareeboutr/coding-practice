class Solution:
    def __init__(self, string):
        self.s = string
    
    def roman_to_int(self):
        roman_symb = {"M" : 1000, "D" : 500, "C" : 100, "L" : 50, "X" : 10, "V" : 5, "I" : 1}

        ans_sum = 0
        for index in range(len(self.s)):
            if index > 0 and roman_symb[self.s[index]] > roman_symb[self.s[index-1]]:
                ans_sum += (roman_symb[self.s[index]]) - (2 * roman_symb[self.s[index-1]])
            else:
                ans_sum += roman_symb[self.s[index]]
        
        return ans_sum

ans_1 = Solution(input())
print(ans_1.roman_to_int())
