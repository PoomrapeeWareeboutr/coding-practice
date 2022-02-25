# Basic Recursion in Python #

def func(n):
    if n <= 50:
        print(n, end=" ")
        return func(n+1)

n = 1
func(n)