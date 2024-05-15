#include<stdio.h>

void main(void){
    int marks[5];
    int total=0;
    float per;

    for(int i=0; i<5; i++){
        printf("Enter marks %d: ",i);
        scanf("%d",&marks[i]);
    }

    for(int i=0; i<5; i++){
        printf("%d\n",marks[i]);
    }

    for(int i=0; i<5; i++){
        total = total + marks[i];
    }

    per = total/5;

    printf("Total: %d\n",total);
    printf("Percentage: %.2f\n",per);
}