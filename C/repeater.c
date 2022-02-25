#include <stdio.h>
#include <string.h>
#define MAX_LEN 100

int main(void)
{
    char str[MAX_LEN+1];
    scanf("%s", str);

    int x = 0;
    int stack = 0;
    int len = strlen(str);
    for(int i = 0; i <= len-1; i++){
        for(int j = len-2; j >= i; j--){
            printf(" ");
            printf(" ");
        }
        for(int k = i; k >= 0; k--){
            if(i == 0){
                printf("%c", str[k]);
            }
            else{
                printf("%c", str[k]);
                printf(" ");
            }
        }
        for(int l = 1; l <= i; l++){
            if(l != i){
                printf("%c", str[l]);
                printf(" ");
            }
            else{
                printf("%c", str[l]);
            }
        }
        printf("\n");
    }

    return 0;
}