#include <stdio.h>

int main(void)
{
    int arr[5];

    for(int i = 0; i < 5; i++){
        scanf("%d", &arr[i]);
    }

    int max;
    int del_index;
    int sort[5];
    
    for(int i = 0; i < 5; i++){
        max = -999999;
        for(int j = 0; j < 5; j++){   
            if(arr[j] > max){
                max = arr[j];
                sort[i] = max;
                del_index = j;
            }
        }
        arr[del_index] = -999999;
    }
    
    //printf("\n");
    for(int i = 0; i < 5; i++){
        printf("%d\n", sort[i]);
    }


    return 0;
}