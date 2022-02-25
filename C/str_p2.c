/// string problem 31 ///
#include <stdio.h>
#include <string.h>

int main(void)
{
    char my_str[] = "this is a test string";
    int length = strlen(my_str);
    int i = 0;
    while(i < length){
        if(my_str[i] == ' '){
            my_str[i] = '\n';
        }



        i++;
    }
    puts(my_str);

    return 0;
}