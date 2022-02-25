#include <stdio.h>
#include <string.h>

int main(void)
{
  char str[20+1];
  scanf("%s ", str);

  int len = strlen(str);
  int arr[len];
  for(int i = 0; i < len; i++){
    scanf("%d", &arr[i]);
  }

  for(int i = 0; i < len; i++){
    for(int j = 0; j < len-1; j++){
      if(arr[j] > arr[j+1]){
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;

        char temp_char = str[j];
        str[j] = str[j+1];
        str[j+1] = temp_char;
      }
    }
  }
  printf("%s", str);

  
}



