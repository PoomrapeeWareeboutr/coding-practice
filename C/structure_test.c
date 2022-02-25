#include <stdio.h>
#include <string.h>
#define MAX_LEN 10

struct person{
    char nickname[MAX_LEN+1];
    int age;
    float height, weight;
};

int main(void)
{   
    struct person student, teacher;
    
    char nickname[MAX_LEN+1];
    fgets(student.nickname, MAX_LEN+1, stdin);
    char *pos;
    if((pos=strchr(student.nickname, '\n')) != NULL){
        *pos = '\0'; 
    }

    scanf("%d", &student.age);
    scanf("%f", &student.height);
    scanf("%f", &student.weight);
    
    printf("-----------------------------------\n");
    printf("\n");
    printf("Name: %s\n", student.nickname);
    printf("Ages: %d\n", student.age);
    printf("Height: %.2f\n", student.height);
    printf("Weight: %.2f\n", student.weight);
    printf("\n");
    printf("-----------------------------------\n");
    
    return 0;
}