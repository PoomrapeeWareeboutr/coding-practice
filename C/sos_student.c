// Structure of structure example //

#include <stdio.h>
#include <string.h>

struct birthday_data{
    int day;
    int month;
    int year;
};

struct address_data{
    char province[20+1];
    char village[20+1];
    char house_number[20+1];
};

struct college_data{
    char name[20+1];
    int id;
    int section;
};

struct student_detail{
    struct college_data clg_data;
    struct address_data add_data;
    struct birthday_data bd_data;
};

void input_college_data(struct student_detail *student_target);
void input_address_data(struct student_detail *student_target);
void input_birthday_data(struct student_detail *student_target);
void display_output(struct student_detail student_target);
int main(void)
{
    struct student_detail student_1, student_2;
    
    // Input section //
    input_college_data(&student_1);
    input_address_data(&student_1);
    input_birthday_data(&student_1);
    student_2 = student_1;

    // Output section //
    display_output(student_2);    

    return 0;
}

void input_college_data(struct student_detail *student_target)
{
    // Part of college_data //
    printf("-----College detail-----\n");
    printf("Name: ");
    scanf("%s", student_target->clg_data.name);
    printf("Student ID: ");
    scanf("%d", &student_target->clg_data.id);
    printf("Student Section: ");
    scanf("%d", &student_target->clg_data.section);
    printf("\n");
}

void input_address_data(struct student_detail *student_target)
{
    // Part of address_data //
    printf("-----Address detail-----\n");
    printf("Province: ");
    scanf("%s", student_target->add_data.province);
    printf("Village: ");
    scanf("%s", student_target->add_data.village);
    printf("House number: ");
    scanf("%s", student_target->add_data.house_number);
    printf("\n");
}

void input_birthday_data(struct student_detail *student_target)
{
    // Part of birthday_data //
    printf("-----Birthday detail-----\n");
    printf("Day: ");
    scanf("%d", &student_target->bd_data.day);
    printf("Month: ");
    scanf("%d", &student_target->bd_data.month);
    printf("Year: ");
    scanf("%d", &student_target->bd_data.year);
    printf("\n");
}

void display_output(struct student_detail student_target)
{
    printf("\n");
    printf("-----Student Information-----\n");
    printf("Student name: %s\n", student_target.clg_data.name);
    printf("Student ID: %d\n", student_target.clg_data.id);
    printf("Student section: %d\n", student_target.clg_data.section);
    printf("\n");

    printf("Address\n");
    printf("Province: %s\n", student_target.add_data.province);
    printf("Village: %s\n", student_target.add_data.village);
    printf("House number: %s\n", student_target.add_data.house_number);
    printf("\n");

    printf("Birthday\n");
    printf("Day: %d\n", student_target.bd_data.day);
    printf("Month: %d\n", student_target.bd_data.month);
    printf("Year: %d\n", student_target.bd_data.year);
    printf("\n");
    printf("--------------------");
}