#include <stdio.h>
#include <string.h>

void merge_sentence(char *mergeSen, char *sentenceA, char *sentenceB) {
    int i = 0;
    int a = 0;
    int b = 0;

    while(a < strlen(sentenceA) && b < strlen(sentenceB)) {
        mergeSen[i++] = sentenceA[a++];
        mergeSen[i++] = sentenceB[b++];
    }
    
    while(a < strlen(sentenceA)) {
        mergeSen[i++] = sentenceA[a++];
    }

    while(b < strlen(sentenceB)) {
        mergeSen[i++] = sentenceB[b++];
    }
}

int main() {
    
    char mergeSentence[200];
    char sentenceA[100];
    char sentenceB[100];

    char *pos;
    fgets(sentenceA, 100, stdin);
    if((pos=strchr(sentenceA, '\n')) != NULL) {
        *pos = '\0';
    }
    
    fgets(sentenceB, 100, stdin);
    if((pos=strchr(sentenceB, '\n')) != NULL) {
        *pos = '\0';
    }

    merge_sentence(mergeSentence, sentenceA, sentenceB);

    printf("%s", mergeSentence);

    return 0;
}