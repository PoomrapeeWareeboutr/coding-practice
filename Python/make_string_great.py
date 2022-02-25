'''
LeetCode's Problem
# 1544 - Make The String Great - Easy
'''

class Solution:
    def makeGood(self, s: str) -> str:
        s_list = list(s)
        s_list.append("*")
        
        i = 0
        while i < len(s_list)-1:
            if (s_list[i+1].isupper() is True) and (s_list[i] == s_list[i+1].lower()):
                s_list.pop(i+1)
                s_list.pop(i)
                i-=1
            elif (s_list[i+1].islower() is True) and (s_list[i] == s_list[i+1].upper()):
                s_list.pop(i+1)
                s_list.pop(i)
                i-=1
            else:
                i+=1

        s_list.remove("*")
        ans = ""
        if len(s_list) > 0:
            i = 0
            while i < len(s_list):
                ans += s_list[i]
                i+=1
            return ans
        else:
            return ans

if __name__ == "__main__":
    s = "leEeetcode"
    ans_1 = Solution()
    print("# test cases: " + "'" + ans_1.makeGood(s) + "'")

    s = "abBAcC"
    ans_2 = Solution()
    print("# test cases: " + "'" + ans_2.makeGood(s) + "'")

    s = "s"
    ans_3 = Solution()
    print("# test cases: " + "'" + ans_3.makeGood(s) + "'")
