# Reverse word in the string #

my_str = input()
str_list = my_str.split(" ")
str_list.reverse()

new_str = ""
new_list = []
for i in str_list:
    if i != "":
        new_list.append(i) 

length = len(new_list)
for i in range(length):
    if i != length-1:
        new_str += new_list[i] + " "
    else:
        new_str += new_list[i]

print(new_str)