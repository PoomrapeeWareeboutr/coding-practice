#include <stdio.h>
#include <string.h>
#define MAX_LEN 20

int main(void)
{
  char text[MAX_LEN];
  fgets(text, MAX_LEN+1, stdin);
  
  char *pos;
  if((pos=strchr(text, '\n')) != NULL){
    *pos = '\0'; 
  }
  
  int count = 0;
  int i = 0;
  int length = strlen(text);
  
  while(i < length){
    if(text[i] >= 'A' && text[i] <= 'Z'){
      text[i] = text[i];
    }
    else if(text[i] >= 'a' && text[i] <= 'z'){
      text[i] = text[i];
    }
    else if(text[i] >= '0' && text[i] <= '9'){
      text[i] = text[i];
    }
    else if(text[i] == ' '){
      text[i] = text[i];
    }
    else{
      count++;
      text[i] = '*';
    }
    i++;
  }
  
  
  int j = 0;
  int k = 0;
  char new_text[MAX_LEN+1];
  while(j < MAX_LEN+1){
    if(text[k] != '*'){
      new_text[j] = text[k];
      j++;
    }
    k++;
  }
  
  printf("%d %s", count, new_text);
  return 0;
}