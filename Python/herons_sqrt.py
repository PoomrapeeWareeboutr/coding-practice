class Solution:

    def mySqrt(self, n: int) -> int:
        if n == 0:
            return n
        
        res = 1
        prev_res = 1
        
        ea = 100
        es = 10**(-6)

        while not ea < es:
            res = (1 / 2) * (prev_res + (n / prev_res))
            ea = (abs(res - prev_res) / res) * 100
            prev_res = res
            
        return math.floor(res)
