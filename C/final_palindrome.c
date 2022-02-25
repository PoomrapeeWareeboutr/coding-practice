/*  -----  Please fill in your information in this comment block -----  
   Student ID: 6388113
   Fullname: Poomrapee Wareeboutr
   Section: 3
---------------------------------------------------------------------- */

/*  ===== Put your code here ===== */
#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main()
{
  char str[100+1];
  fgets(str, sizeof(str), stdin);
  char *p;
  if((p = strchr(str, '\n')) != NULL){
    *p = '\0';
  }
  
  char new[100+1];
  for(int i = 0; i < strlen(str); i++){
    str[i] = tolower(str[i]);
  }
  
  int x = 0;
  for(int i = 0; i < strlen(str); i++){
    if(str[i] != ' ' && (str[i] >= 'a' && str[i] <= 'z')){
      new[x] = str[i];
      x++;
    }
  }

  printf("%s\n", new);
  new[x] = '\0';
  char rev_new[100+1];
  int revIndex = strlen(new) - 1;
  int z = 0;
  while(z < strlen(new)){
    rev_new[z] = new[revIndex];
    revIndex--;
    z++;
  }
  rev_new[z] = '\0';
  
  printf("%s\n", rev_new);
  if((strcmp(rev_new, new)) == 0){
    printf("Palindrom");
  }
  else{
    printf("Not palindrom");
  }
  
  return 0;
}