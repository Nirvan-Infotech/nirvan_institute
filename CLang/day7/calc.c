#include<stdio.h>

void main(void){
    int n1,n2,key=1, opt;
    char opr;

    printf("1. Add (+)\n");
    printf("2. Sub (-)\n");
    printf("3. Mul (*)\n");
    printf("4. Div (/)\n");
    printf("5. Mod (mod)\n");
    printf("6. Exit\n");
    printf("======================\n");
    while(key == 1){
        printf("Enter number1: ");
        scanf("%d",&n1);
        printf("Enter number2: ");
        scanf("%d",&n2);
        printf("Enter Operator(+,-,*,/,mod,e): ");
        scanf(" %c",&opr);

        if(opr == '+'){
            printf("Addition of %d + %d is %d\n",n1,n2,n1+n2);
        }
        else if(opr == '-'){
            printf("Subtration of %d - %d is %d\n",n1,n2,n1-n2);
        }
        else if(opr == '/'){
            printf("Division of %.2f / %.2f is %.2f\n",(float)n1,(float)n2,(float)n1/(float)n2);
        }
        else if(opr == 'e'){
            printf("Good bye.\n");
            key = 0;
            break;
        }

    }
}