# Fibonacci triangle in Python #

n = int(input())
sum = 0
num1 = 0
num2 = 1
for i in range(1, n+1):
    for j in range(1, i+1):
        if i == 1 and j == 1:
            print(0)
        elif i == 2 and j == 1:
            print(1, end="\t")
        elif j != i:
            sum = num1 + num2
            print(sum, end="\t")
            num1 = num2
            num2 = sum
        else:
            sum = num1 + num2
            print(sum)
            num1 = num2
            num2 = sum



    