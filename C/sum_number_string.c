#include <stdio.h>

int func(char *str, int *arr, int index, char check_num, int convert_num);
int convert(char number, char check_num, int convert_num);

int main(void)
{
    int size = 10;
    char str[size+1];
    scanf("%s", str);
    
    int index = 0;
    int digits = 0;
    int arr[size];
    char check_num = '0';
    int convert_num = 0;
    int total = func(str, arr, index, check_num, convert_num);
    printf("%d", total);


    return 0;
}

int func(char *str, int *arr, int index, char check_num, int convert_num)
{
    if(str[index] != '\0'){
        if(str[index] >= '0' && str[index] <= '9'){
            arr[index] = convert(str[index], check_num, convert_num);
            return arr[index] + func(str, arr, index+1, check_num, convert_num);
        }
    }
    else{
        return 0;
    }
}

int convert(char number, char check_num, int convert_num)
{
    if(number != check_num){
        return convert(number, check_num+1, convert_num+1);
    }
    else if(number == check_num){
        return convert_num;
    }
    else{
        return 0;
    }
}

