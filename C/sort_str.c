#include <stdio.h>
#include <string.h>

int main()
{
    int x;
    scanf("%d", &x);
    
    char names[x][20+1];
    char temp[20+1];

    for (int i = 0; i < x; i++) {
        scanf("%s", names[i]);
    }

    for(int i = 0; i < x; i++){
        for(int j = 0; j < x - 1; j++){
            if(strcmp(names[j], names[j + 1]) > 0){
                strcpy(temp, names[j]);
                strcpy(names[j], names[j + 1]);
                strcpy(names[j + 1], temp);
            }
        }
    }

    for (int i = 0; i < x; i++) {
        printf("%s\n", names[i]);
    }

    return 0;
}