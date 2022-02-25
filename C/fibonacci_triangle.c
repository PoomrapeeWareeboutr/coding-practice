#include <stdio.h>

int main(void)
{
    int x;
    scanf("%d", &x);

    int num1 = 0;
    int num2 = 1;
    int sum = 0;
    for(int i = 1; i <= x; i++){
        for(int j = 1; j <= i; j++){
            if(i == 1 && j == 1){
                printf("0\t");
            }
            else if(i == 2 && j == 1){
                printf("1\t");
            }
            else{
                sum = num1 + num2;
                printf("%d\t", sum);
                num1 = num2;
                num2 = sum;
            }
        }
        printf("\n");
    }
    return 0;
}