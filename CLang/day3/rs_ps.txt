//  price = 47.25 
//  rs = 47
// paise = 25

#include<stdio.h>

void main(){
    float price;
    int rs, paise;

    printf("Enter price: ");
    scanf("%f", &price);

    rs = price;
    paise = (price - rs) * 100;

    printf("Rupees: %d\n", rs);
    printf("Paise: %d\n", paise); 
}


// 125 -> 60

/*
    125
    120 -> 
    2 hours
    5 mins
*/