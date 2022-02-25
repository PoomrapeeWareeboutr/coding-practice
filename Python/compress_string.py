'''
HackerRank's Problem
# Compress the String! - Medium
'''
class Solution:
    def __init__(self, s):
        self.s = s

    def compressTheString(self):
        self.s += "*"
        new_s = ""

        i = 0
        while i < len(self.s) - 1:
            if self.s[i] == self.s[i+1]:
                new_s += self.s[i]
            elif self.s[i] != self.s[i+1]:
                new_s += self.s[i] + " "
            i += 1
        
        new_list = new_s.split(" ")
        new_list.remove("")
        for i in new_list:
            print("({}, {})".format(len(i), i[0]), end=" ")

if __name__ == "__main__":
    
    s = input()
    ans_1 = Solution(s)
    ans_1.compressTheString()

# test_case: 1222311