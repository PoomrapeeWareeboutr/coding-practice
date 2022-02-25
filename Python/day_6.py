'''
HackerRank's Problem
# 30 Days of code
# Day 6: Let's Review - Easy
'''
if __name__ == '__main__':
    
    n = int(input())
    s_list = []
    ans_list = []
    
    i = 0
    while i < n:
        s_list.append(input())
        i += 1
    
    for s in s_list:
        even_char = ""
        odd_char = ""
        i = 0
        while i < len(s):
            if i%2 == 0:
                even_char += s[i]
            elif i%2 != 0:
                odd_char += s[i]
            i += 1
        ans_string = even_char + " " + odd_char
        ans_list.append(ans_string)

    for s in ans_list:
        print(s)