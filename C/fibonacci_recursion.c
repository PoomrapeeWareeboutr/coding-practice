#include <stdio.h>

void func(int *num1, int *num2, int *sum, int t);

int main(void)
{
    int term;
    scanf("%d", &term);

    int num1 = 0;
    int num2 = 1;
    int sum = 0;
    printf("%d ", num1);
    printf("%d ", num2);
    func(&num1, &num2, &sum, term-2);
    
}

void func(int *num1, int *num2, int *sum, int t)
{   
    if(t >= 1){
        *sum = *num1 + *num2;
        printf("%d ", *sum);
        *num1 = *num2;
        *num2 = *sum;
        t--;
        func(num1, num2, sum, t);
    }
}

