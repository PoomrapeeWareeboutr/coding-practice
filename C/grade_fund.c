#include <stdio.h>

struct Student{
  char name[20+1];
  float lab_score;
  float quiz_score;
  float midterm_score;
  float final_score;
};

void input_data(struct Student *person);
float grade_calculator(struct Student person);
char your_grade(float score);

int main(void)
{
    struct Student person;
    char grade;
    float total_score;
    input_data(&person);
    total_score = grade_calculator(person);
    grade = your_grade(total_score);

    printf("%s's final score: %.2f\n", person.name, total_score);
    printf("Your grade: %c\n", grade);
    if(grade == 'F' || grade == 'D'){
        printf("It's okay. See you next semester!");
    }
    else{
        printf("PASS");
    }


    return 0;
}

void input_data(struct Student *person)
{
    scanf("%s", person->name);
    scanf("%f", &person->lab_score);
    scanf("%f", &person->quiz_score);
    scanf("%f", &person->midterm_score);
    scanf("%f", &person->final_score);
}

float grade_calculator(struct Student person)
{
    float total;
    total = ((15*person.lab_score) + (25*person.quiz_score) + (25*person.midterm_score) + (35*person.final_score))/100;
    return total;
}

char your_grade(float score)
{   
    char grade;
    if(score <= 55){
        grade = 'F';
        return grade;
    }
    else if(score > 55 && score <= 65){
        grade = 'D';
        return grade;
    }
    else if(score > 65 && score <= 75){
        grade = 'C';
        return grade;
    }
    else if(score > 75 && score <= 85){
        grade = 'B';
        return grade;
    }
    else{
        grade = 'A';
        return grade;
    }
}