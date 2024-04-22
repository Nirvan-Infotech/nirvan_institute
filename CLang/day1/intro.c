#include<stdio.h>

void main(){
    int age;
    float result;

    printf("Enter your age: ");
    scanf("%d", &age);

    printf("Enter your result: ");
    scanf("%f", &result);

    printf("My name is ______.\n");
    printf("My age is %d\n",age);
    printf("My result is %.2f\n",result);
}