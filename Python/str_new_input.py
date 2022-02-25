# One of all method to format the string #
'''
This method like a printf("%c %c", color, animal) in C Language
It can be have many arguments in one print line and we can change it anytime
So comfortable!!!
'''

default_animal = "cat"
print("I love a {0}".format(default_animal))

input_color = input()
print("I love a {0} {1}".format(input_color, default_animal))

input_animal = input()
print("I love a {0} {1}".format(input_color, input_animal))