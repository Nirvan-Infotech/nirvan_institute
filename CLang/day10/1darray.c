/*
    Declare Array: 
        data_type arr_name[size];
    
    Define Array: 
        data_type arr_name[size] = {v1,v2,v3,...,vn};
*/

#include<stdio.h>

void main(void){
    int marks[4];

    marks[0] = 55;
    marks[1] = 99;
    marks[2] = 97;
    marks[3] = 59;

    // printf("marks 0: %d\n",marks[0]);
    // printf("marks 1: %d\n",marks[1]);

    for(int i=0; i<4; i++){
        printf("marks %d: %d\n",i, marks[i]);
    }

}