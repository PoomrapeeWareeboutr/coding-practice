'''
HackerRank's Problem
# No Idea! - Medium level
'''

def happinessScore(arr , A, B):
    score = 0
    for i in arr:
        if i in A:
            score += 1
        if i in B:
            score -= 1
    return score


if __name__ == "__main__":
    # One line command #
    n, m = map(int, input().split())

    arr = list(map(int, input().split()))
    A = set(map(int, input().split()))
    B = set(map(int, input().split()))
    
    print(happinessScore(arr, A, B))