/// string problem 34 ///
#include <stdio.h>
#include <string.h>

int main(void)
{
    char my_str[] = "w3resource";
    int length = strlen(my_str);
    
    int i = 0;
    while(i < length){
        if(my_str[i] == 'a'){
            my_str[i] = 'A';
        }
        else if(my_str[i] == 'e'){
            my_str[i] = 'E';
        }
        else if(my_str[i] == 'i'){
            my_str[i] = 'I';
        }
        else if(my_str[i] == 'o'){
            my_str[i] = 'O';
        }
        else if(my_str[i] == 'u'){
            my_str[i] = 'U';
        }
        else{
            my_str[i] = my_str[i];
        }
        i++;    
    }
    puts(my_str);




}