'''
LeetCode's Problems #868
Binary Gap - Easy
'''
class Solution:
    def binaryGap(self, n: int) -> int:
        
        binary_list = []
        while n != 0:
            pop = n % 2
            n //= 2
            binary_list.append(str(pop)) 

        binary_list.reverse()
        print(binary_list)
        
        i = 0
        max_dist = 0
        while i < len(binary_list):
            if binary_list[i] == '1':
                binary_list.pop(i)
                binary_list.insert(i, '*')
                j = i
                dist = 0
                while j < len(binary_list):
                    if binary_list[j] == '1':
                        if dist > max_dist:
                            max_dist = dist
                        break
                    dist += 1
                    j += 1
            i += 1
        return max_dist

if __name__ == "__main__":
    ans_1 = Solution()
    n = int(input())
    print(ans_1.binaryGap(n))