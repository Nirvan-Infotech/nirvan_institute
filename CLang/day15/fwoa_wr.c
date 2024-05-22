// 3. Function without arguments & with return value

#include<stdio.h>

int square(){
    int num;
    printf("Enter any number: ");
    scanf("%d",&num);

    return num*num;
    // int sq = num*num;
    // return sq;
}
void main(){
    int sq = square();
    printf("%d\n",sq);
    printf("Square: %d\n",square());
}