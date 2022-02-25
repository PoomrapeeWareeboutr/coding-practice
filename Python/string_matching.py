'''
LeetCode's Problem
# 1408 - String Matching in an Array - Easy
'''
class Solution:
    def stringMatching(self, words):
        
        sub_string = set()
        i = 0
        while i < len(words):
            j = 0
            while j < len(words):
                if i != j and words[i] in words[j]:
                    sub_string.add(words[i])
                j += 1
            i += 1
        if len(sub_string) == 0:
            return 0
        else:
            return sub_string

if __name__ == "__main__":
    
    words = ["mass","as","hero","superhero"]
    ans_1 = Solution()
    print(ans_1.stringMatching(words))

    words = ["leetcode","et","code"]
    ans_2 = Solution()
    print(ans_2.stringMatching(words))

    words = ["blue","green","bu"]
    ans_3 = Solution()
    print(ans_3.stringMatching(words))
    
