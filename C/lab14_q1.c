
#include <stdio.h>

struct Subject{
    char name[100+1];
    float weight;
    float height;

};

float func(struct Subject person);

int main(void)
{
    int amount;
    scanf("%d", &amount);
    
    struct Subject person[amount];
    for(int i = 0; i < amount; i++){
        scanf("%s", person[i].name);
        scanf("%f", &person[i].weight);
        scanf("%f", &person[i].height);
    }

    int f = 0;
    float bmi;
    for(int i = 0; i < amount; i++){
        bmi = func(person[i]);
        if(bmi < 18.5){
            f = 1;
            printf("%s is underweight: w=%.2f, h=%.2f, bmi=%.2f\n",
            person[i].name, person[i].weight, person[i].height, bmi
            );
        }
    }
    if(f == 0){
        printf("No underweight subjects");
    }



    return 0;
}

float func(struct Subject person)
{
    float bmi = (person.weight)/(person.height*person.height);
    return bmi;
}

