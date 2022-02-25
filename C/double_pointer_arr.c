#include <stdio.h>
#include <stdlib.h>

int main(void)
{
    int **arr = (int**)calloc(5, sizeof(int*));

    for(int i = 0; i < 5; i++){
        arr[i] = (int*)calloc(5, sizeof(int));
    }

    for(int i = 0; i < 5; i++){
        for(int j = 0; j < 5; j++){
            printf("%d ", *(*(arr + i) + j)); 
            // printf("%d ", arr[i][j]);
        }
        printf("\n");
    }
    free(arr);
    return 0;
}