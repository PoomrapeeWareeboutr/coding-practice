#include <stdio.h>
#include <string.h>
#define SIZE 50000

int lengthOfLongestSubstring(char *s);

int main(void)
{
    char str[SIZE];
    scanf("%s", str);
    
    int dest = lengthOfLongestSubstring(str);
    printf("%d", dest);



    return 0;
}

int lengthOfLongestSubstring(char *s)
{
    
    char substring[SIZE][20];
    int endIndex;
    int i = 0, j = 0, k = 0;
    int x = 0, z = 0;
    while(s[i] != '\0'){
        j = i;
        endIndex = strlen(s);
        while(j < endIndex){
            k = j;
            z = 0;
            while(k < endIndex){
                substring[x][z] = s[k];
                k++;
                z++;
            }
            substring[x][z] = '\0';
            endIndex--;
            x++;
        }
        i++;
    }
    
    char ans[] = "";
    int max_length = 0;
    int test_case = 20;
    int flag;
    for(int a = 0; a < test_case; a++){
        flag = 0;
        int b = 0;
        while(substring[a][b] != '\0'){
            int c = 0;
            int count = -1;
            int index = 0;
            if(flag == 1){
                break;
            }
            while(substring[a][c] != '\0'){
                if(substring[a][c] == substring[a][b]){
                    count += 1;
                    if(count == 1){
                        flag = 1;
                        break;
                    }
                }
                index++;
                c++;
            }
            b++;
        }
        if(flag == 0){
            if(strlen(substring[a]) > max_length){
                max_length = strlen(substring[a]);
                strcpy(ans, substring[a]);
            }
        }
    }
    
    
    printf("%s\n", ans);

    return max_length;

}
