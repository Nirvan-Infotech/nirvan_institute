#include<stdio.h>

void main(){
    float radius, area;
    // PI * r * r
    const float PI = 3.14;

    printf("Enter radius: ");
    scanf("%f",&radius);

    area = PI * radius * radius;

    printf("Area of Circle having radius %.2f is %.2f\n",radius, area);
}