'''
Codeforces Problems
# 1440A - Buy the String
'''
def all_prices_n(n, coin, h, string, digit):
    str_list = list(string)
    amount = str_list.count(digit)
    total_prices = (len(string)*coin) + (h * amount)
    return total_prices

def no_changing(n, coin_0, coin_1, string):
    str_list = list(string)
    amount_0 = str_list.count("0")
    amount_1 = str_list.count("1")
    total_prices = (amount_0 * coin_0) + (amount_1 * coin_1)
    return total_prices

def prices(n, coin_0, coin_1, h, string):
    a = all_prices_n(n, coin_0, h, string, "1") # All coin is 0
    b = all_prices_n(n, coin_1, h, string, "0") # All coin is 1
    c = no_changing(n, coin_0, coin_1, string)  # No changing any character in string and calculate the prices of 0 and 1 follow the itself
    values = [a, b, c]                          # For find minimum values
    
    return min(values)

if __name__ == "__main__":
    # Ask the user number of query #
    query = int(input())
    
    # Set of the information input # 
    while query != 0:
        n = int(input())
        coin_0 = int(input())
        coin_1 = int(input())
        h = int(input())
        string = input()
        
        print("Min values is:", prices(n, coin_0, coin_1, h, string))
        query -= 1