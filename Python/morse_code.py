'''
LeetCode's Problem
# 804 - Unique Morse Code Words - Easy
'''

import string

class Solution:
    def uniqueMorseRepresentations(self, words) -> int:
        morse = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
            "-.-",".-..","--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-","-.--","--.."
        ]
        alpha = list(string.ascii_lowercase)

        ans_set = set()
        for word in words:
            i = 0
            ans = ""
            while i < len(word):
                j = 0
                while j < len(alpha):
                    if word[i] == alpha[j]:
                        ans += morse[j]
                    j += 1
                i += 1
            ans_set.add(ans)
        
        print(ans_set)
        return len(ans_set)

if __name__ == "__main__":
    
    words = ["gin", "zen", "gig", "msg"]
    
    ans_1 = Solution()
    print(ans_1.uniqueMorseRepresentations(words))
    