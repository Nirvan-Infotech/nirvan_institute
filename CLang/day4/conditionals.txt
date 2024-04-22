/*
    2. Relational (comparison) Operators

        ==  -> is equal to
        !=  -> not equal to
        >   -> greater than
        <   -> less than
        >=  -> greater than or equal to
        <=  -> less than or equal to

        conditional statements

            - if statement
            - if...else statement
            - else if ... else statement
            - nested if statement
            - switch...case


            - if statement

                if(condition){
                    // logic
                }

            - if...else statement
                if(condition){
                    // logic if true
                }
                else{
                    // logic if false
                }
*/

#include<stdio.h>

void main(){
    int age;

    printf("Enter your age: ");
    scanf("%d",&age);

    if(age >= 18){
        printf("You're elegible to vote.");
    }
    else{
        printf("You're not elegible to vote.");
    }
}