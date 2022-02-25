# Try anything that you want #

n = int(input())
emails = []

for i in range(n):
    emails.append(input())

i = 0
j = 0
emails_set = set()
edit_string = []
str_temp = ""
index = 0
for i in emails:
    str_temp = ""
    '''
    Split the string to two part
    local name and domain name
    '''
    edit_string.append(i.rsplit("@"))           
    
    '''
    Edit a local name following the instructor
    '''
    for character in edit_string[index][0]:
        if character == "+":
            break
        if character != ".":
            str_temp += character
    
    '''
    Concatenate the email that already edited with domain name
    '''
    str_temp += "@" + edit_string[index][1]
    # Add the email to the set #
    emails_set.add(str_temp)
    index+=1

print(len(emails_set))