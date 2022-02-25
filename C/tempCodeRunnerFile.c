#include <stdio.h>
#include <string.h>

int min(int a, int b) { 
    return ((a <= b) ? a : b); 
} 

int max(int a, int b) { 
    return ((a >= b) ? a : b); 
} 

int main() {
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);

    int min_value = min(a, min(b, c));
    int max_value = max(a, max(b, c));

    printf("min = %d \nmax = %d", min_value, max_value);


    printf("%d", a);
    return 0;
}