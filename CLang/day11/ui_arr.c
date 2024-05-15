#include<stdio.h>

void main(void){
    int age[5];

    for(int i=0; i<5; i++){
        printf("Enter age %d: ",i);
        scanf("%d",&age[i]);
    }

    for(int i=0; i<5; i++){
        printf("%d\n",age[i]);
    }
}