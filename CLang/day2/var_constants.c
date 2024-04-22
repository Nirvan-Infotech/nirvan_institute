#include<stdio.h>
#define MAX 12.23

int main(){
    int marks = 85;
    float tax = 18.25;
    double price = 78.254645426;
    char a;
    a = 'A';

    const float pi = 3.14;

    printf("Marks: %d\n",marks);
    printf("Tax: %.2f\n",tax);
    printf("Price: %.9lf\n",price);
    printf("char: %c\n",a);

    printf("PI: %.2f\n",pi);
    printf("MAX: %f\n",MAX);
    return 0;
}