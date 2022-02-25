/*  -----  Please fill in your information in this comment block -----  
   Student ID: 6388113
   Fullname: Poomrapee Wareeboutr
   Section: 3
---------------------------------------------------------------------- */

/*  ===== Put your code here ===== */
#include <stdio.h>
#include <string.h>

struct Book{
  int id;
  char title[50+1];
  char author[50+1];
  int amount;

};

struct Book scanbook();
int checkbook(struct Book mybook);
void printinfo(struct Book mybook);
struct Book updatebook(struct Book mybook, char *query);

int main(void)
{
  struct Book book;
  book = scanbook();
  
  char fake;
  scanf("%c", &fake);
  char press;
  scanf("%c", &press);
  
  // Press 0, 1, 2 Part to select a option //
  if(press == '0'){
    if(checkbook(book) == 1){
      printf("Available");
    }
    else{
      printf("Not available");
    }
  }
  else if(press == '1'){
    printinfo(book);
  }
  else if(press == '2'){
    char new_name[50+1];
    scanf("%s", new_name);
    book = updatebook(book, new_name);
    printinfo(book);
  }


  return 0;
}

struct Book scanbook()
{
  struct Book book;
  scanf("%d", &book.id);
  scanf("%s %s", book.title, book.author);
  scanf("%d", &book.amount);
  return book;
}

int checkbook(struct Book mybook)
{
  if(mybook.amount > 0){
      return 1;
    }
    else{
      return 0;
    }
}

void printinfo(struct Book mybook)
{
  printf("Book ID: %d\n", mybook.id);
  printf("Book Name: %s\n", mybook.title);
  printf("Author: %s\n", mybook.author);
  printf("Amount: %d", mybook.amount);
}

struct Book updatebook(struct Book mybook, char *query)
{
  strcpy(mybook.title, query);
  return mybook;
}