#include <stdio.h>

int checkPossibility(int *nums, int numsSize);

int main(void)
{
    int n;
    scanf("%d", &n);
    int arr[n];
    for(int i = 0; i < n; i++){
        scanf("%d", &arr[i]);
    }
    
    if(checkPossibility(arr, n) == 1){
        printf("true");
    }
    else{
        printf("false");
    }
}

int checkPossibility(int *nums, int numsSize)
{   
    int new[numsSize];
    for(int i = 0; i < numsSize; i++){
        new[i] = nums[i];
    }
    int c = 1;
    int flag = 0;
    for(int i = 0; i < numsSize-1; i++){
        for(int j = 0; j < numsSize-1; j++){
            if(nums[j] > nums[j+1]){
                if(c <= 0){
                    flag = 1;
                    c--;
                    continue;
                }
                nums[j] = nums[j+1] - 1;
                c--;
            }
        }
    }
    if(flag == 1){
        for(int i = 0; i < numsSize; i++){
            if(new[i] > new[i+1]){
                new[i+1] = new[i+1+1];
            }
        }
        
        // Display the result after changed the element with approch 2 //
        for(int i = 0; i < numsSize; i++){
            printf("%d ", new[i]);
        }
        
        // Check a new array that changed by the above code //
        for(int i = 0; i < numsSize; i++){
            if(new[i] > new[i+1]){
                return 0;
            }
            else if(i == numsSize-1){
                return 1;
            }
        }
    }
    else{
        if(c >= 0){
            // Display the result after changed the element with approch 1 - true //
            for(int i = 0; i < numsSize; i++){
                printf("%d ", nums[i]);
            }
            return 1;
        }
        else{
            // Display the result after changed the element with approch 1 - false //
            for(int i = 0; i < numsSize; i++){
                printf("%d ", nums[i]);
            }
            return 0;
        }
    }
}