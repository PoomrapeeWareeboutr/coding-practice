#include <stdio.h>
#define NCourse 3

struct Course{
    char code[7+1];
    int credits;
    int hours;
};

struct Instructor{
    char name[15+1];
    char gender;
    struct Course course[NCourse];
};

struct Instructor get_info();
void print_info();

int main() {
    int n;
    scanf("%d", &n);
    struct Instructor instructors[n];
    for (int i=0 ; i<n ; i++) {
        instructors[i] = get_info();
    }
    for (int i=0 ; i<n ; i++) {
        print_info(instructors[i]);
    }
    return 0;
}

struct Instructor get_info()
{   
    struct Instructor person;
    scanf("%s %c", person.name, &person.gender);
    
    for(int i = 0; i < NCourse; i++){
        scanf("%s", person.course[i].code);
        scanf("%d", &person.course[i].credits);
        scanf("%d", &person.course[i].hours);
    }
    return person;
}

void print_info(struct Instructor person)
{
    printf("%s (%c)\n", person.name, person.gender);
    
    for(int i = 0; i < NCourse; i++){
        printf("- %s (%d credits, %d hours)\n", 
        person.course[i].code, person.course[i].credits, person.course[i].hours
        );
    }
}