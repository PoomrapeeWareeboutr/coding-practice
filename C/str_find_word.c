// How many words in the string? //

#include <stdio.h>
#include <string.h>
#define SIZE 10

int main(void)
{
    char string[] = "Apple Cats Orange Cucumber Apple Mango";
    char word_target[SIZE+1];

    scanf("%s", word_target);

    int word_target_length = strlen(word_target);
    int index_target, x;
    int count = 0;
    int index = 0;
    while(string[index] != '\0'){
        x = index;
        index_target = 0;
        while(string[x] == word_target[index_target]){
            if(string[x] == word_target[index_target]){
                if(index_target == word_target_length-1){
                    count++;
                    break;
                }
                x++;
                index_target++;
            }
            else{
                break;
            }
        }
        index++;
    }
    printf("%d %d", count, word_target_length);



    return 0;
}