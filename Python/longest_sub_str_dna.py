'''
Mathematics Science Olympiad of Thailand 
Computer Program of the Year 2004
# 1019 - DNA

Test cases:
1.    
    A = CTGAATCTACTGCTATTGCAA
    B = AAAACTGCTACCGGT
    Ans = ACTGCTA
2.
    A = AAACTGCACACTGTGTGGGGGACTGG
    B = ACTGTGTGTGACACTGACAGTGACTGGGACTGAAGGGGGGG
    Ans = ACTGTGTG
'''

class DNA:
    def __init__(self, dna_string):
        self.dna = dna_string
    
    def sub_str_dna(self):
        sub_string = [self.dna[i: j] for i in range(len(self.dna)) for j in range(i + 1, len(self.dna) + 1)]
        return sub_string

if __name__ == "__main__":
    A = input()
    B = input()
    
    dna_1 = DNA(A)
    dna_2 = DNA(B)
    
    sub_str_A = dna_1.sub_str_dna()
    sub_str_B = dna_2.sub_str_dna()
    
    longest_sub = 0
    ans_dna = ""
    for i in sub_str_A:
        for j in sub_str_B:
            if i == j:
                if len(i) > longest_sub:
                    longest_sub = len(i)
                    ans_dna = i
    
    print(ans_dna)