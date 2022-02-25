#include <stdio.h>
#include <string.h>
#define MAX_LEN 20

int main(void)
{
  char text1[MAX_LEN+1];
  char text2[MAX_LEN+1];
  fgets(text1, MAX_LEN+1, stdin);
  strcpy(text2, text1);
  
  int length = strlen(text1);
  int most = 0;
  int count = 0;
  char letter;
  
  int i = 0;
  while(i < length){
    for(int j = 0; j < length; j++){
      if(text1[i] == text2[j]){
        count++;
        if(count > most){
          most = count;
          letter = text1[i];
        }
      }
    }
    count = 0;
    i++;
  }  

  printf("%d %c", most, letter);
  
  return 0;
}