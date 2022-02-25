#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <math.h>

int func(int num, int power);
int main(void)
{
    char a[20+1];
    char b[20+1];
    char binary_total[20+1];
    scanf("%s", a);
    scanf("%s", b);
    int n1 = atoi(a);
    int n2 = atoi(b);
    if(n1 == 0 && n2 == 0){
        printf("Numbers 0 = 0 in Binary");
        return 0;
    }

    int length1 = strlen(a);
    int length2 = strlen(b);
    int power1 = length1-1;
    int power2 = length2-1;
    int sum1 = 0;
    int sum2 = 0; 
    for(int i = 0, j = 0; i < length1 || j < length2; i++, j++){
        int num1, num2;
        if(a[i] == '0'){
            num1 = 0;
        }        
        if(a[i] == '1'){
            num1 = 1;
        }
        if(b[j] == '0'){
            num2 = 0;
        }
        if(b[j] == '1'){
            num2 = 1;
        }     
        sum1 = func(num1, power1) + sum1;
        sum2 = func(num2, power2) + sum2;
        power1--;
        power2--;
    }
    int total = sum1 + sum2;
    int temp = total;
    int pop;
    int x = 0;
    while(total != 0){
        char unit;
        pop = total%2;
        total /= 2;
        if(pop == 0){
            unit = '0';
        }
        if(pop == 1){
            unit = '1';
        }
        binary_total[x] = unit;
        x++;
    }
    binary_total[x] = '\0';
    
    char cpy[20+1];
    strcpy(cpy, binary_total); 
    int i = 0;
    for(int c = strlen(binary_total)-1, d = 0; c >= 0, d < strlen(binary_total); c--, d++){
        binary_total[d] = cpy[c];
    }
    
    printf("Numbers %d = %s in Binary", temp, binary_total);
    return 0;
}

int func(int num, int power)
{
    int sum;
    if(power > 0){
        return (num*pow(2, power));
    }
    else if(power == 0){
        return (num*1);
    }
    else{
        return 0;
    }
}