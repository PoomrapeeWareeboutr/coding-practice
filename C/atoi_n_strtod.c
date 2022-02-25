// Basic of atoi and strtod //
// Atoi   - atoi, atof, atol, etc //
// strtod - strod, strtof, etc // 

#include <stdio.h>
#include <stdlib.h>

int main(void)
{
    char str[20+1];
    fgets(str, sizeof(str), stdin);

    char *word;
    int i = atoi(str);
    int j = strtod(str, &word);
    printf("%d %d %s", i, j, word);
    
}

