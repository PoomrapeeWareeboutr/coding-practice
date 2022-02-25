#include <stdio.h>

int recursive(int n);

int main(void)
{
    int n;
    int result;
    scanf("%d", &n);

    result = recursive(n);

    printf("%d", result);
    return 0; 
}

int recursive(int n)
{
    if(n > 0){
        return recursive(n-1) + 100;
    }
    else if(n == 0){
        return 1;
    }
    else{
        return -1;
    }
}