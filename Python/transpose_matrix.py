'''
LeetCode's Problem
# 867 - Transpose Matrix - Easy
'''

class Solution:
    def transpose(self, A):
        new_row = []
        new_arr = []
        i = 0
        while i < len(A[0]):
            j = 0
            new_row.clear()
            while j < len(A):
                new_row.append(A[j][i])
                j+=1
            temp = new_row.copy()
            new_arr.append(temp)
            i+=1
        
        return new_arr

if __name__ == "__main__":
    
    arr = [[1,2,3],[4,5,6],[7,8,9]]
    ans_1 = Solution()
    print(ans_1.transpose(arr))
    
    print("")
    arr = [[1,2,3],[4,5,6]]
    ans_2 = Solution()
    print(ans_2.transpose(arr))