# Palindrome check by Python #

string = input()
new_str = []

length = len(string)
index = length - 1
while index >= 0:
    new_str.append(string[index])
    index-=1

i = 0
while i < length:
    if(new_str[i] == string[i]):
        if(i == length-1):
            print("The initial string:", string)
            print("The reverse string: ", *new_str, sep="")
            print("This string is the Palindrome")
            break
        i+=1
    else:
        print("The initial string:", string)
        print("The reverse string: ", *new_str, sep="")
        print("This string is not the Palindrome")
        break