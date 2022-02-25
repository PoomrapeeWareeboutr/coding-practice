'''
Python 3 Problem | Leetcode # 121
Best Time to Buy and Sell Stock
'''
class Solution:
    def tempProfit(self, prices) -> int:
        
        if len(prices) <= 1:
            return 0 

        min_index = 0
        min_values = prices[0]
        for i in range(len(prices)):
            if prices[i] < min_values:
                min_values = prices[i]
                min_index = i
        
        if min_index == len(prices)-1:
            prices.pop(min_index)
            return self.maxProfit(prices)
        else:
            max_values = prices[min_index]
            for i in range(min_index, len(prices)):
                if prices[i] > max_values:
                    max_values = prices[i]
            return max_values - min_values
             
    
    def maxProfit(self, prices) -> int:
        max_list = []
        index = 0
        while index < len(prices):
            arr = prices
            max_list.append(self.tempProfit(arr))
            if len(prices) >= 1:
                prices.pop(len(prices)-1)
            index+=1

        return max(max_list)
        
if __name__ == "__main__":
    prices1 = [3,2,6,5,0,3] # Ans = 4
    prices2 = [7,1,5,3,6,4] # Ans = 5
    prices3 = [7,6,4,3,1]   # Ans = 0
    
    ans_1 = Solution()
    ans_2 = Solution()
    ans_3 = Solution()

    print(ans_1.maxProfit(prices1))
    print(ans_2.maxProfit(prices2))
    print(ans_2.maxProfit(prices3))
    


    