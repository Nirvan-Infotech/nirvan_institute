// 2. Function with arguments & without return value
#include<stdio.h>

// function defination
void sum(int a, int b){
    int total = a+b;
    printf("Total: %d\n",total);
}

void main(){
    // function call
    sum(10, 5);
    sum(-10, 10);
}