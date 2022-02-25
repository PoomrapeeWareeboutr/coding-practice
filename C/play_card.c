#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <conio.h> // This library for function getch() //

int player1_card();
int player2_card();
void result(int player1, int player2);

//Player 1 Card//
int p1_card1;
int p1_card2;
int p1_card3;
//Player 2 Card//
int p2_card1;
int p2_card2;
int p2_card3 = 0;

int main(void)
{   
    int player1;
    int player2;

    player1 = player1_card();
    player2 = player2_card();
    
    printf("\n");
    printf("\t*****<==============================>*****\n");
    printf("\n");
    
    if(player1 > player2){
        printf("\tYou won!!! Chicken Chicken Dinner!!!\n");
        result(player1, player2);  
    }
    else if(player1 == player2){
        printf("\tDraw... It's almost good...\n");
        result(player1, player2);
    }
    else{
        printf("\tYou lose... Destiny is not chosen you...\n");
        result(player1, player2);
    }

    return 0;
}
void result(int player1, int player2)
{
    printf("Player 1 (You) points: %d\n", player1);
    printf("\t1st card: %d points\n", p1_card1);
    printf("\t2nd card: %d points\n", p1_card2);
    printf("\t3rd card: %d points\n", p1_card3);
    printf("----------------------------------------\n");
    printf("Player 2 (Bot) points: %d\n", player2);
    printf("\t1st card: %d points\n", p2_card1);
    printf("\t2nd card: %d points\n", p2_card2);
    printf("\t3rd card: %d points\n", p2_card3);
    printf("----------------------------------------\n");
}

int player1_card()
{
    int sum;
    int card_1, card_2, card_3;
    
    time_t now;
    srand(time(&now));
    
    card_1 = rand()%10+1;
    if(card_1 == 10){
        card_1 = 0;
    }
    p1_card1 = card_1;
    
    card_2 = rand()%10+1;
    if(card_2 == 10){
        card_2 = 0;
    }
    p1_card2 = card_2;
    
    sum = card_1 + card_2;
    printf("\n");
    printf("\n");
    printf("The first card: %d\n", card_1);
    printf("The second card: %d\n", card_2);
    printf("The third card: ?\n");
    printf("Would you like to draw the third card?\n");
    printf("-----\t-----\t-----\t-----\t-----\t\n");
    printf("Press 1 - Draw\n");
    printf("Press 2 - Not draw\n");
    printf("-----\t-----\t-----\t-----\t-----\t\n");
    
    char press;
    int new_sum;
    while(press != '1' && press != '2'){
        press = getchar();
    }
    if(press == '1'){
        card_3 = rand()%10+1;
        if(card_3 == 10){
            card_3 = 0;
        }
        p1_card3 = card_3;

        new_sum = sum + card_3;
        while(new_sum >= 10){
            new_sum -= 10;
        }
        printf("The third card: %d\n", card_3);
        return new_sum;
    }
    if(press == '2'){
        if(sum >= 10){
            sum -= 10;
        }
        return sum;
    }   
}

int player2_card()
{
    int sum;
    int card_1, card_2;
    
    time_t now;
    srand(time(&now));
    
    card_1 = rand()%10+1;
    if(card_1 == 10){
        card_1 = 0;
    }
    p2_card1 = card_1;

    card_2 = rand()%10+1;
    if(card_2 == 10){
        card_2 = 0;
    }
    p2_card2 = card_2;

    sum = card_1 + card_2;
    if(sum >= 10){
        int new_sum = sum - 10;
        return new_sum;
    }
    else{
        return sum;
    }
    
}