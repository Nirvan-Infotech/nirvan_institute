#include<stdio.h>

void main(){
    int i=1;
    int key = 1;
    while(key == 1){
        if(i > 10){
            key = 0;
            break;
        }
        printf("%d\n",i);
        i++;
    }
}