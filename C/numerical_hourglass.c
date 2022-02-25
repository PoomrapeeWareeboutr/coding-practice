#include <stdio.h>

int main()
{   
    int n;
    int dist = 26;
    for(int i = 1; i <= 7; i++){
        n = 7;
        for(int j = 1; j <= i; j++){
            printf("%d ", n);
            n--;
        }
        for(int k = 1; k <= dist; k++){
            printf(".");
        }
        n = 7;
        for(int l = i-1; l >= 0; l--){
            printf(" %d", n-l);
        }
        dist -= 4;
        printf("\n");
    }
    
    dist = 6;
    for(int i = 1; i <= 6; i++){
        n = 7;
        for(int j = 7; j >= i+1; j--){
            printf("%d ", j);
        }
        for(int k = 1; k <= dist; k++){
            printf(".");
        }
        for(int l = i+1; l <= 7; l++){
            printf(" %d", l);
        }
        dist += 4;
        printf("\n");
    }



    return 0;
}