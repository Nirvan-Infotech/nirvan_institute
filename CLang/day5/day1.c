#include<stdio.h>

void main(void){
    int day;

    printf("Enter any day: ");
    scanf("%d",&day);

    switch(day){
        case 1:
            printf("Monday");
            break;
        case 2:
            printf("Tuesday");
            break;
        case 3:
            printf("Wednesday");
            break;
        default:
            printf("Invalid day");
            break;
    }
}