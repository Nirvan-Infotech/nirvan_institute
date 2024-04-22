#include<stdio.h>

void main(){
    float m, km;

    printf("Enter distance in meters: ");
    scanf("%f", &m);

    km = m / 1000;

    printf("Distance in Kilometers: %f", km);
}