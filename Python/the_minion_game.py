'''
HackerRank's Problem
# The Minion Game - Medium
'''
def minion_game(string):
    stuart_str_list = []
    kevin_str_list = []
    vowels = ["A", "E", "I", "O", "U", "a", "e", "i", "o", "u"]
    
    # Stuart's substring set #
    for i in range(len(string)):
        j = i
        length = len(string)
        if string[j] not in vowels:
            while j < length:
                stuart_str_list.append(string[j: length])
                length -= 1
    
    # Kevin's substring set #
    for i in range(len(string)):
        j = i
        length = len(string)
        if string[j] in vowels:
            while j < length:
                kevin_str_list.append(string[j: length])
                length -= 1

    p1 = "{:13} {:12} {}".format("All Stuart's", "substring:", stuart_str_list)
    p2 = "{:13} {:12} {}".format("All Kevin's", "substring:", kevin_str_list)
    print(p1)
    print(p2)
    
    stuart_score = len(stuart_str_list)
    kevin_score = len(kevin_str_list)

    if stuart_score > kevin_score:
        print("Stuart", stuart_score)
    elif kevin_score > stuart_score:
        print("Kevin", kevin_score)
    else:
        print("Draw")

if __name__ == '__main__':
    s = input()
    minion_game(s)