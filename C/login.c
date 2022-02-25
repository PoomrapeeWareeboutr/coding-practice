#include <stdio.h>
#include <string.h>
#define MAX_LEN 10

int main(void){
    char username[MAX_LEN+1];
    char password[MAX_LEN+1];
    
    printf("-----Register-----\n");
    printf("\n");
    printf("Username: ");
    scanf("%s", username);
    int username_len = strlen(username);
    while(username_len > MAX_LEN){
        printf("Username is too longer, try again...\n");
        printf("Username: ");
        scanf("%s", username);
        username_len = strlen(username);
    }
    
    printf("Password: ");
    scanf("%s", password);
    int password_len = strlen(password);
    while(password_len > MAX_LEN){
        printf("Password is too longer, try again...\n");
        printf("Password: ");
        scanf("%s", password);
        password_len = strlen(password);
    }
    printf("\n");
    puts(username);
    printf("\n");
    puts(password);












}