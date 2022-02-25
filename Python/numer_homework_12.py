import numpy as np

# x = input()
# y = input()

# x = [float (n) for n in x.split()]
# y = [float (n) for n in y.split()]

# print(x)
# print(y)

# n = len(x)
# x1_sum, x2_sum, x3_sum, x4_sum = 0, 0, 0, 0
# y1_sum, xy_sum, x2y_sum = 0, 0, 0

# for i in range(n):
#     x1_sum += x[i]
#     x2_sum += x[i]**2
#     x3_sum += x[i]**3
#     x4_sum += x[i]**4

#     y1_sum += y[i]
#     xy_sum += x[i] * y[i]
#     x2y_sum += x[i]**2 * y[i]

# x = np.array([
#     [n, x1_sum, x2_sum],
#     [x1_sum, x2_sum, x3_sum],
#     [x2_sum, x3_sum, x4_sum]
# ])

# y = np.array([
#     [y1_sum],
#     [xy_sum],
#     [x2y_sum]
# ])

# print(x, '\n')
# print(y, '\n')


# i = int(input())
# x_target = float(input())
# m = (y[i] - y[i-1]) / (x[i] - x[i-1])
# si = y[i-1] + m * (x_target - x[i-1]) 

# print(si)

x0 = 1.0
x1 = 4.0
x2 = 7.0

y0 = 1.0
y1 = 3.0
y2 = 2.0
a = np.array([
    # condition 1
    [x0**1, 1, 0, 0, 0],
    [x1**1, 1, 0, 0, 0],
    [0, 0, x1**2, x1**1, 1],
    [0, 0, x2**2, x2**1, 1],

    # condition 2
    [1, 0, -8, -1, 0]
])

b = np.array([
    # condition 1 
    [y0],   # b1
    [y1],   # c1
    [y1],   # a2
    [y2],   # b2

    # condition 2
    [0]     # c2
])

print(0)
print(np.linalg.solve(a, b))
x = 5
print(-0.33333333*x**2 + 3.33333333*x + -5.)


# 3.803