#include <stdio.h>
#include <string.h>
#define SIZE 10000

char *reverseWords(char *s);

int main(void)
{
    char s[SIZE+1];
    fgets(s, sizeof(s), stdin);
    char *pos;
    if((pos = strchr(s, '\n')) != NULL){
        *pos = '\0';
    }

    char *new_str = reverseWords(s);
    
    printf("%s", new_str);
}

char *reverseWords(char *s)
{    
    int count = 0;
    int i = 0;
    while(s[i] != '\0'){
        if(s[i] != ' ' && s[i+1] == ' '){
            count++;
        }
        i++;
    }
    count+=1;
    
    // Split a words in the string and store to 2D array of char //
    char arr_char[count][SIZE+1];
    i = 0;
    int j = 0;
    int x = 0;
    while(i < count){
        while(s[x] != ' '){
            arr_char[i][j] = s[x];
            j++;
            x++;
        }
        j = 0;
        x++;
        if(s[x] == ' '){
            continue;
        }
        i++;
    }
    
    // Concatenate string together //
    char new_char[SIZE+1];
    for(int a = count-1; a >= 0; a--){
        if(a == count-1){
            strcpy(new_char, arr_char[a]);
            strcat(new_char, " ");
        }
        else if(a != 0){
            strcat(new_char, arr_char[a]);
            strcat(new_char, " ");
        }
        else{
            strcat(new_char, arr_char[a]);
        }
    }
    char *new;
    new = new_char;
    return new;
}