#include <stdio.h>
#include <string.h>

int main(void)
{
  // Input //
  char str[50+1];
  fgets(str, sizeof(str), stdin);
  char *pos;
  if((pos = strchr(str, '\n')) != NULL){
    *pos = '\0';
  }
  
  // Set up //
  char new_str[20+1];
  int last = strlen(str);
  int index = last-1;
  int x = 0;
  
  // Print out first inverse //
  while(str[index] != ' '){
    printf("%c", str[index]);
    index--;
  }
  // Avoid spacebar //
  index++;
  
  // Print out second inverse //
  printf("\n");
  while(str[index] != '\0'){
    printf("%c", str[index]);
    index++;
  }

}