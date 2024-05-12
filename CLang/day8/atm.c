/*
    -> Withdraw Money
        amt < bal
        atm has 500 notes only

    -> Deposit Money
        amt >= 5000
        atm only accept 500 notes

    -> Show Balance

    -> Exit

*/

#include<stdio.h>

void main(void){
    int amt, bal = 10000, opt;
    int key = 1;
    printf("1. Withdraw Money\n");
    printf("2. Deposit Money\n");
    printf("3. Show Balance\n");
    printf("4. Exit\n");

    while(key == 1){
        printf("\nSelect Option: ");
        scanf("%d",&opt);

        if(opt == 1){
            printf("\nEnter amount to withdraw: ");
            scanf("%d",&amt);
            if(amt < bal){
                if(amt%500==0){
                    printf("%d amount withdrawed.\n",amt);
                    bal = bal - amt;
                }
                else{
                    printf("Only 500 notes are available");
                }
            }
            else{
                printf("Insufficient Balance\n");
                printf("Available balance: %d\n",bal);
            }
        }
        else if(opt == 2){
            printf("Deposit Money");
        }
        else if(opt == 3){
            printf("Available balance: %d\n",bal);
        }
        else if(opt == 4){
            printf("Visit Again :)");
            key = 0;
            break;
        }
    }

}