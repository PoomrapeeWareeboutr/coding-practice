#include <stdio.h>
#include <stdbool.h>
#include <math.h>

int check_digits(int n, int count)
{
  int pop;
  printf("%d ", n);
  while(n != 0){
    pop = n % 10;
    n /= 10;
    if(pop == 1){
      count++;
    }
  }
  return count;
}

int countDigitOne(int n)
{ 
  if(n == 0){
    return 0;
  }
  else if(n == 1){
    return 1;
  }
  
  int count = 0;
  int sum = 1;
  while(sum < n){
    count = check_digits(sum, count);
    sum += 1;
  }
  
  count = check_digits(n, count);


  return count;
}

int main(void)
{
  int n;
  scanf("%d", &n);
  printf("\nNumber of digit one is: %d", countDigitOne(n));


  return 0;
}