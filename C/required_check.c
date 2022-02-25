#include <stdio.h>
#include <string.h>
void check(char str[]);

int main(void)
{
    char str[100+1];
    scanf("%s", str);
    int len = strlen(str);
    if(len > 20){
        printf("Invalid");
    }
    else{
        check(str);
    }
    
    return 0;
}

void check(char str[])
{
    int i = 0;
    int s1 = 0;
    int s2 = 0;
    int s3 = 0;
    int s4 = 0;    
    while(str[i] != '\0'){
        if(str[i] >= 'a' && str[i] <= 'z'){
            s1 = 1;
        }
        else if(str[i] >= 'A' && str[i] <= 'Z'){
            s2 = 1;
        }
        else if(str[i] >= '0' && str[i] <= '9'){
            s3 = 1;
        }
        else{
            s4 = 1;
        }
        i++;
    }
    if(s1 == 1 && s2 == 1 && s3 == 1 && s4 == 1){
        printf("Valid");
    }
    else{
        printf("Invalid");
    }
}