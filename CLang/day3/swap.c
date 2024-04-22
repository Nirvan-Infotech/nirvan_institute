// swap two numbers using 3rd variable

// a = 10, b = 20 -> a = 20, b = 10

#include<stdio.h>

void main(){
    int a=10, b=20, c;

    printf("Berfore swaping: \nA: %d, B: %d\n",a,b);

    c = a;
    a = b;
    b = c;

    printf("After swaping: \nA: %d, B: %d\n",a,b);
}