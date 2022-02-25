/// string problem 33 ///
#include <stdio.h>
#include <string.h>

int main(void)
{
    char my_str[] = "w3resource";
    char str_check[] = "w3resource";
    
    int i = 0;
    int count = 0;
    int length = strlen(my_str);
    
    while(i < length){
        for(int j = 0; j < length; j++){
            if(my_str[i] == str_check[j]){
                count++;
            }
        }
        printf("%c\t", my_str[i]);
        printf("%d\n", count++);
        count = 0;
        i++;
    }

    return 0;
}