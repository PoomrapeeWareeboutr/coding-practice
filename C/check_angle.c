#include <stdio.h>

int check(float x, float y, float z);

int main(void)
{
    float x, y, z;
    scanf("%f %f %f", &x, &y, &z);
    check(x, y, z);

    return 0;
}

int check(float x, float y, float z)
{
    if(x == 90 || y == 90|| z == 90){
        printf("Right-angled triangle");
        return 0;
    }
    else if((x != y && y != z && x != z) && (x > 90 || y > 90 || z > 90)){
        printf("Obtuse triangle");
        return 0;
    }
    else{
        printf("Oblique triangle");
        return 0;
    }
    return -1;
}
