#include<stdio.h>

float aor(int r){
    return 3.14*r*r;
}

void main(){
    int area = aor(10);
    printf("%f", area);
}