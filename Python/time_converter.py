if __name__ == "__main__":
    second = int(input())
    
    h_s_m = [3600, 60, 1]
    time_format = [0, 0, 0]

    while second != 0:
        i = 0
        while i < len(h_s_m):
            if second - h_s_m[i] >= 0:
                second -= h_s_m[i]
                time_format[i] += 1
            else:
                i += 1
        
    print(time_format)
