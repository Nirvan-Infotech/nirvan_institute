#include<stdio.h>

void main(){
    int a,b;
    float aa=12.22, bb=3.3;
    printf("Enter value of a & b: ");
    scanf("%d%d",&a,&b);

    printf("%d + %d = %d\n",a,b,a+b);
    printf("%d - %d = %d\n",a,b,a-b);
    printf("%d * %d = %d\n",a,b,a*b);
    printf("%d mod %d = %d\n",a,b,a%b);
    
    printf("%f / %f = %f\n",aa,bb,aa/bb);
}