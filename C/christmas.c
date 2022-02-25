#include <stdio.h>

void triangle(int x, int z);
void base(int x);

int main(void)
{
    int x;
    scanf("%d", &x);

    int z = 2;
    for(int i = 1; i <= x; i++){
        triangle(x, z);
        z++;
    }
    base(x);

    return 0;
}

void triangle(int x, int z)
{
    for(int a = 1; a <= z; a++){
        for(int b = a; b <= x; b++){
            printf(" ");
        }
        for(int c = 1; c <= a; c++){
            printf("*");
        }
        for(int d = 2; d <= a; d++){
            printf("*");
        }
        printf("\n");
    }
}

void base(int x)
{
    for(int i = 1; i <= x; i++){
        printf(" ");
    }
    printf("|\n");
    for(int j = 1; j <= (x*2)+1; j++){
        if(j == x + 1){
            printf("V");
        }
        else{
            printf("=");
        }
    }
}