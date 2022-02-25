
flowerbed = [1, 0, 0, 0, 1, 0, 0]

n = int(input())

# Check the main condition and sub condition before return #

if len(flowerbed) > 0 and n == 0:
    print("true")
elif len(flowerbed) == 1:
    if flowerbed[0] == 0 and n == 1:
        print("true")
    elif flowerbed[0] == 1 and n == 0:
        print("true")
    else:
        print("false")
else:
    i = 0
    while i < len(flowerbed):
        if i == 0:
            if flowerbed[i] == 0 and (flowerbed[i+1] == 0):
                flowerbed[i] = 1
                n -= 1
                if n == 0:
                    break
        elif i > 0 and i < len(flowerbed)-1:
            if flowerbed[i] == 0 and (flowerbed[i-1] == 0 and flowerbed[i+1] == 0):
                flowerbed[i] = 1
                n -= 1
                if n == 0:
                    break
        elif i == len(flowerbed)-1:
            if flowerbed[i] == 0 and (flowerbed[i-1] == 0):
                flowerbed[i] = 1
                n -= 1
                if n == 0:
                    break
        i+=1
    
    if n == 0:
        print("true")
    else:
        print("false")

print(n)
print(flowerbed)

