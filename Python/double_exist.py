'''
Leetcode's Problem
# 1346 - Check If N and Its Double Exist - Easy
'''
class Solution:
    def checkIfExist(self, arr) -> bool:
        flag = 0
        i = 0
        while i < len(arr):
            if flag == 1:
                break
            j = 0
            while j < len(arr):
                if arr[i] * 2 == arr[j] and i != j:
                    flag = 1
                    break
                j += 1
            i += 1

        
        if flag == 1:
            return True
        else:
            return False

if __name__ == "__main__":

    arr = [3,1,7,11]
    ans_1 = Solution()
    
    print(ans_1.checkIfExist(arr))