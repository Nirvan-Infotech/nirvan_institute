#include<stdio.h>

void main(void){
    int matrix[2][2] = {{1,2}, {3,4}};

    for(int row=0; row<2; row++){
        printf("\n");
        for(int col=0; col<2; col++){
            printf("%d ",matrix[row][col]);
        }
    }
}