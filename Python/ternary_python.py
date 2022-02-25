#!/bin/python3

import math
import os
import random
import re
import sys

# If n is odd, print Weird
# If n is even and in the inclusive range of  to , print Not Weird
# If n is even and in the inclusive range of  to , print Weird
# If n is even and greater than , print Not Weird

if __name__ == '__main__':
    N = int(input())

    # if N % 2 != 0:
    #     print("Weird")
    # elif N % 2 == 0 and (N >= 2 and N <= 5):
    #     print("Not Weird")
    # elif N % 2 == 0 and (N >= 6 and N <= 20):
    #     print("Weird")
    # elif N % 2 == 0 and N > 20:
    #     print("Not Weird")

    # Below is same to an above #
    print("Weird") if N % 2 != 0 else print("Not Weird") if N % 2 == 0 and (N >= 2 and N <= 5) else print("Weird") if N % 2 == 0 and (N >= 6 and N <= 20) else print("Not Weird")
    
