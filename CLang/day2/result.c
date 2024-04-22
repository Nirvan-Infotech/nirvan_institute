#include<stdio.h>

void main(){
    int clang, cpp, py;
    int total;
    float per;

    printf("Enter marks of C Lang: ");
    scanf("%d",&clang);
    printf("Enter marks of C++: ");
    scanf("%d",&cpp);
    printf("Enter marks of Python: ");
    scanf("%d",&py);

    total = clang + cpp + py;
    per = total/3;

    printf("************************\n");
    printf("*\tRESULT\t*\n");
    printf("************************\n");
    printf("*C Lang: %d*\n",clang);
    printf("*C++: %d*\n",cpp);
    printf("*Python: %d*\n",py);
    printf("************************\n");
    printf("*Total Marks: %d*\n",total);
    printf("*Percentage: %.2f*\n",per);
    printf("************************\n");

}