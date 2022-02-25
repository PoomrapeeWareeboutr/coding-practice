#include <stdio.h>

int main(void)
{
  int x = 10;
  void *address_x = (void*)&x;

  printf("%p\n", &x);
  printf("%p\n", address_x);
  printf("\n");

  void *address_address_x = (void*)&address_x;
  printf("%p\n", &address_x);
  printf("%p\n", address_address_x);


  return 0;
}