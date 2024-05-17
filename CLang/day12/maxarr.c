#include<stdio.h>

void main(){
    int arr[5] = {44, 33, 96, 75, 54};
    int max = arr[0];

    for(int i=0; i<5; i++){
        if(arr[i] > max){
            max = arr[i];
        }
    }
    printf("Max value: %d\n",max);
}
