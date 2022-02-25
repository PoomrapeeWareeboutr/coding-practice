#include <stdio.h>
#include <string.h>

int main(void)
{
    int n;
    scanf("%d", &n);
    
    int size = 100 + 1;
    char s[n][size];
    char dest[n][size];
    for(int i = 0; i < n; i++){
        scanf("%s", s[i]);
    }
    
    // Edit an email following the instructions //
    int i = 0;
    int x = 0;
    while(i < n){
        int j = 0;
        int z = 0;
        char *p = strchr(s[i], '@');
        while(s[i][j] != '+'){
            if(s[i][j] != '.' ){
                dest[x][z] = s[i][j];
                z++;
            }
            j++;
        }
        int k = p - s[i];
        while(s[i][k] != '\0'){
            dest[x][z] = s[i][k];
            k++;
            z++;
        }
        dest[x][z] = '\0';
        i++;
        x++;
    }
    
    // Find an duplicate emails and convert its to " * " //
    i = 0;
    while(i < n){
        int j = 0;
        int count = -1;
        while(j < n){
            if(strcmp(dest[i], dest[j]) == 0){
                count++;
                if(count > 0){
                    strcpy(dest[j], "*");
                }
            }
            j++;
        }
        i++;
    }
    
    // Count a unique emails //
    int amount = 0;
    for(int a = 0; a < n; a++){
        if(strcmp(dest[a], "*") != 0){
            amount++;
        }
    }
    
    printf("-----List of Unique emails-----\n");
    for(int a = 0; a < n; a++){
        printf("%s\n", dest[a]);
    }
    printf("%d", amount);
    
    
    

    return 0;
}