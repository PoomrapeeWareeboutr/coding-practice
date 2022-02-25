// Reverse integer //
// 123456 //
// 654321 //

#include <stdio.h>
#define MAX 2147483647
#define MIN -2147483648

int func(int x);

int main(void)
{
  int x;
  scanf("%d", &x);

  int result = func(x);
  
  printf("%d", result);
  return 0;
}

int func(int x)
{
  int result = 0;
  int unit;
  while(x != 0){
    unit = x % 10;
    x /= 10;
    if(result > MAX/10 || (result == MAX/10 && unit > 7)){
      return 0;
    }
    else if(result < MIN/10 || (result == MIN/10 && unit < -8)){
      return 0;
    }
    else{
      result = (result * 10) + unit;
    }
  }
  return result;
}
