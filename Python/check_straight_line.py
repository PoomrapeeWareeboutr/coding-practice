'''
LeetCode's Problem
# 1232 - Check If It Is a Straight Line - Easy
'''

class Solution:
    def findSlope(self, x1, y1, x2, y2):
        if x2 - x1 == 0:
            return -1
        else:
            return (y2 - y1)/(x2 - x1)

    def checkStraightLine(self, p):
        
        print(p)
        const_slope = self.findSlope(p[0][0], p[0][1], p[1][0], p[1][1])
        
        c = 1
        i = 0
        while i < len(p)-1:
            temp_slope = self.findSlope(p[i][0], p[i][1], p[i+1][0], p[i+1][1])
            if temp_slope != const_slope:
                c = 0
                break
            i+=1
        
        if c == 1:
            return True
        else:
            return False
            
if __name__ == "__main__":
    
    p = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
    ans_1 = Solution()
    print(ans_1.checkStraightLine(p))
    
    p = [[0, 1], [0, 0], [1, -1]]
    ans_2 = Solution()
    print(ans_2.checkStraightLine(p))
