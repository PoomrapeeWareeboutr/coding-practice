'''
Leetcode's Problem
# 1323 - Maximum 69 Number - Easy
'''

class Solution:
    def listToInt(self, temp_list):
        sum = 0
        for i in temp_list:
            sum = (sum * 10) + i
        return sum

    def convertListToNum(self, temp_list):
        i = 0
        while i < len(temp_list):
            if temp_list[i] == "6":
                temp_list.pop(i)
                temp_list.insert(i, 6)
            elif temp_list[i] == "9":
                temp_list.pop(i)
                temp_list.insert(i, 9)
            i += 1
            
        return temp_list

    def maximum69Number (self, num: int):
        num_list = list(str(num))
        
        max = num
        i = 0
        while i < len(num_list):
            temp_list = self.convertListToNum(num_list.copy())            
            if temp_list[i] == 6:
                temp_list.pop(i)
                temp_list.insert(i, 9)
                sum = self.listToInt(temp_list)
                if sum > max:
                    max = sum
                
            elif temp_list[i] == 9:
                temp_list.pop(i)
                temp_list.insert(i, 6)
                sum = self.listToInt(temp_list)
                if sum > max:
                    max = sum
            i += 1
    
        return max

if __name__ == "__main__":
    
    num = int(input())
    ans_1 = Solution()    
    print("Maximum values of {} is: {}".format(num, ans_1.maximum69Number(num)))
#   print("Maximum values of %d is: %d" % (num, ans_1.maximum69Number(num))) -----> C Style like a printf("%d %d", x, y) 
