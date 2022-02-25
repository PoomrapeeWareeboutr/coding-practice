#include <stdio.h>

struct HousePrice{
    float house_size;
    int amount_bed;
    int amount_bath;
    char renovated;
    int price;
};

void input_data(struct HousePrice *target_h);

int main(void)
{
    struct HousePrice h[3];

    for(int i = 0; i < 3; i++){
        input_data(&h[i]);
    }
  
    for(int i = 0; i < 3; i++){
        printf("s=%.1f ", h[i].house_size);
        printf("bed=%d ", h[i].amount_bed);
        printf("bath=%d ", h[i].amount_bath);
        printf("re=%c ", h[i].renovated);
        printf("price=%d ", h[i].price);
        printf("\n");
    }


    return 0;
}

void input_data(struct HousePrice *target_h)
{
    scanf("%f %d %d %c %d",
        &target_h->house_size,
        &target_h->amount_bed,
        &target_h->amount_bath,
        &target_h->renovated,
        &target_h->price
    );
}