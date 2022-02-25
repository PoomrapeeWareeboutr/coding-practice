class Solution:
    def __init__(self, num):
        self.num = num

    def int_to_roman(self):
        values = [
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4,
            1
        ]
        alpha = [
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV",
            "I"
        ]
        
        self.roman = ""
        while self.num > 0:
            char = 0
            for i in values:
                if self.num - i < 0:
                    char += 1
                else:
                    self.roman += alpha[char]
                    temp = i
                    break
            self.num -= temp

x = int(input())
ans1 = Solution(x)
ans1.int_to_roman()
print(ans1.roman)
