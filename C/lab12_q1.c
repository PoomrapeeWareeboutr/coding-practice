#include <stdio.h>
#define MAX 20

int main(void)
{
  char my_string[MAX];
  int upper = 0;
  int lower = 0;
  int number = 0;
  
  int i = 0;
  fgets(my_string, MAX+1, stdin);
  
  while(my_string[i] != '\0'){
    if(my_string[i] >= 'A' && my_string[i] <= 'Z'){
      upper++;
    }
    else if(my_string[i] >= 'a' && my_string[i] <= 'z'){
      lower++;
    }
    else if(my_string[i] >= '0' && my_string[i] <= '9'){
      number ++;
    }
    i++;
  }
  printf("%d %d %d", upper, lower, number);
  return 0;
  
}