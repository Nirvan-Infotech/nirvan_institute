// 4. Function with arguments & with return value

#include<stdio.h>

int square(int num){
    return num*num;
    // int sq = num*num;
    // return sq;
}
void main(){
    int sq = square(8);
    printf("%d\n",sq);
    printf("Square: %d\n",square(9));
}

// pi * r * r