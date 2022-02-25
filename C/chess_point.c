#include <stdio.h>
#define SIZE 8

void count_point(char board[], int *result);

int main(void)
{
    char board_r1[SIZE+1];
    char board_r2[SIZE+1];
    char board_r3[SIZE+1];
    char board_r4[SIZE+1];
    char board_r5[SIZE+1];
    char board_r6[SIZE+1];
    char board_r7[SIZE+1];
    char board_r8[SIZE+1];

    scanf("%s", board_r1);
    scanf("%s", board_r2);
    scanf("%s", board_r3);
    scanf("%s", board_r4);
    scanf("%s", board_r5);
    scanf("%s", board_r6);
    scanf("%s", board_r7);
    scanf("%s", board_r8);

    int my_point, op_point;
    int result = 0;
    count_point(board_r1, &result);
    count_point(board_r2, &result);
    count_point(board_r3, &result);
    count_point(board_r4, &result);
    count_point(board_r5, &result);
    count_point(board_r6, &result);
    count_point(board_r7, &result);
    count_point(board_r8, &result);

    if(result == 0){
        printf("equal");
    }
    else{
        printf("%d", result);
    }
    return 0;
}

void count_point(char board[], int *result){
    int sum = 0;
    int i = 0;
    while(board[i] != '\0'){
        if(board[i] == 'P'){
            sum = sum + 1;
        }
        else if(board[i] == 'p'){
            sum = sum - 1;
        }
        if(board[i] == 'N' || board[i] == 'B'){
            sum = sum + 3;
        }
        else if(board[i] == 'n' || board[i] == 'b'){
            sum = sum - 3;
        }
        else if(board[i] == 'R'){
            sum = sum + 5;
        }
        else if(board[i] == 'r'){
            sum = sum - 5;
        }
        else if(board[i] == 'Q'){
            sum = sum + 9;
        }
        else if(board[i] == 'q'){
            sum = sum - 9;
        }
        else if(board[i] == 'K'){
            sum = sum + 0;
        }
        else if(board[i] == 'k'){
            sum = sum - 0;
        }
        i++;
    }
    *result = *result + sum;
}
