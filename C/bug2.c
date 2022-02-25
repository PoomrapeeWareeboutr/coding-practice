#include <stdio.h>
#define N 3

struct Address{
    int house_number;
    char district[20+1];
    int zip_code;
};

struct Person {
    char name[20+1];
    int age;
    struct Address habitat;
};

int main(void) {
    struct Person p[N];
    for(int i = 0; i < N; i++){
        scanf("%s", p[i].name);
        scanf("%d", &p[i].age);
        scanf("%d", &p[i].habitat.house_number);
        scanf("%s", p[i].habitat.district);
        scanf("%d", &p[i].habitat.zip_code);
    }

    for(int i = 0; i < N; i++){
        printf("Name=%s ", p[i].name);
        printf("Age=%d ", p[i].age);
        printf("Address=%d,%s,%d", p[i].habitat.house_number, p[i].habitat.district, p[i].habitat.zip_code);
        printf("\n");
    }

  
  
  
    return 0;
}