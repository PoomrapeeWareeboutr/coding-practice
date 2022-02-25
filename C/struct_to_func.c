#include <stdio.h>
#include <string.h>

void del_enter(char booktarget[]);

struct books{
    char name[50+1];
    char author[50+1];
    int price;
};

void inputdata(struct books *booktaget);
void printbooks(struct books booktarget);

int main(void)
{   
    struct books book1, book2;
    inputdata(&book1);
    inputdata(&book2);
    
    printf("-----This is book-----\n");
    printbooks(book1);
    printf("\n");
    printbooks(book2);


    return 0;
}

void del_enter(char booktarget[])
{
    char *pos;
    if((pos = strchr(booktarget, '\n')) != NULL){
        *pos = '\0'; 
    }
}

void inputdata(struct books *booktarget)
{
    scanf("%s", booktarget->name);
    scanf("%s", booktarget->author);
    scanf("%d", &booktarget->price);
}
void printbooks(struct books booktarget)
{
    printf("%s\n", booktarget.name);
    printf("%s\n", booktarget.author);
    printf("%d\n", booktarget.price);
}