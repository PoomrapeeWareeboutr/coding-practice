/// Rescale data to 0-1 ///

#include <stdio.h>

int main(void){
    
    int m, n;
    scanf("%d", &m);
    scanf("%d", &n);
    
    float arr[n][m];
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            scanf("%f", &arr[i][j]);
        }
    }

    float max = arr[0][0];
    float min = arr[0][0];
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            if(arr[i][j] > max){
                max = arr[i][j];
            }
            if(arr[i][j] < min){
                min = arr[i][j];
            }
        }
    }
    float norm_arr[n][m];
    for(int i = 0; i <= n - 1; i++){
        for(int j = 0; j <=  m - 1; j++){
            norm_arr[i][j] = (arr[i][j] - min)/(max - min);
            if(j != m - 1){
                printf("%.4f", norm_arr[i][j]);
                printf(" ");
            }
            else{
                printf("%.4f", norm_arr[i][j]);
            }
        }
        printf("\n");
    }
    

    return 0;
}