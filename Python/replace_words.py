# String input = "the cattle was rattled by the battery" #

string = input()
dict_list = ["catt","cat","bat","rat"]
str_list = string.split(" ")

i = j = 0
ans = ""
while i < len(str_list):
    j = 0
    while j < len(dict_list):
        if str_list[i].startswith(dict_list[j]) == True:
            str_list.pop(i)
            # or str_list.remove(str_list[i])
            str_list.insert(i, dict_list[j])
        j+=1
    
    if i < len(str_list)-1:
        ans += str_list[i] + " "
    else:
        ans += str_list[i]
    i+=1

print(ans)