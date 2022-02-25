// Check the word that whether is a palindrome or not //

#include <stdio.h>
#include <string.h>
#define SIZE 20

int main(void)
{
    char string[SIZE+1];
    char new_str[SIZE+1];
   
    gets(string);
    
    int length = strlen(string);
    int index = length-1;
    int x = 0;
    while(index >= 0){
        new_str[x] = string[index];
        x++;
        index--;
    }

    if(strcmp(new_str, string) == 0){
        printf("Palindrome");
    }
    else{
        printf("Not Palindrom");
    }

    

    return 0;
}