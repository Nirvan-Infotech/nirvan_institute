// find max from 3 numbers

#include<stdio.h>

void main(){
    int a,b,c;

    printf("Enter 3 numbers: ");
    scanf("%d%d%d",&a, &b, &c);

    if(a>b && a>c){
        printf("a is max");
    }
    else if(b>a && b>c){
        printf("b is max");
    }
    else if(c>a && c>b){
        printf("c is max");
    }
    else{
        printf("All are equal");
    }
}