#include <stdio.h>
#include <string.h>

int main(void)
{
  int x = 10;
  char str1[x+1];
  char str2[x+1];
  char str3[x+1];
  
  scanf("%s", str1);
  scanf("%s", str2);
  scanf("%s", str3);

  char all_strs[100+1];
  strcpy(all_strs, str1);
  strcat(all_strs, ",");
  strcat(all_strs, str2);
  strcat(all_strs, ",");
  strcat(all_strs, str3);

  printf("%s", all_strs);

  
  return 0;
}