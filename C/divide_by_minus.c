#include <stdio.h>

int count(int a, int b); 

int main(void)
{
    int a, b;
    scanf("%d %d", &a, &b);
    if(b == 0){
        printf("Infinity");
        return 0;
    }
    int n;
    
    if(a < 0 && b < 0){
        a *= -1;
        b *= -1;
        n = count(a, b);
    }
    else if(a < 0 && b >= 0){
        a *= -1;
        n = count(a, b);
        n *= -1;
    }
    else if(a >= 0 && b < 0){
        b *= -1;
        n = count(a, b);
        n *= -1;
    }
    else{
        n = count(a, b);
    }
    
    printf("%d", n);
    return 0;
}

int count(int a, int b)
{
    int count = 0;
    while(a >= 0){
        if(a - b < 0){
            break;
        }
        a -= b;
        count++;
    }
    return count;
}
