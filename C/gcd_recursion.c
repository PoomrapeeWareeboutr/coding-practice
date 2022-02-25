#include <stdio.h>

int func(int max, int min, int i);
void find_min(int num1, int num2, int *max, int *min);

int main(void)
{
    int num1, num2;
    scanf("%d", &num1);
    scanf("%d", &num2);

    int gcd;
    int max, min;
    find_min(num1, num2, &max, &min);

    int i = min;
    gcd = func(max, min, i);

    printf("%d", gcd);
    return 0;
}

void find_min(int num1, int num2, int *max, int *min)
{
    if(num1 > num2){
        *max = num1;
        *min = num2;
    }
    else{
        *max = num2;
        *min = num1;
    }
}

int func(int max, int min, int i)
{
    if(max%i == 0 && min%i == 0){
        return i;
    }
    else if(i != 1){
        return func(max, min, i-1);
    }
    else{
        return 1;
    }
}