#include<stdio.h>

void main(){
    int arr[2][2][2] = {
                        {
                            {1,2},
                            {3,4}
                        },
                        {
                            {5,6},
                            {7,8}
                        }
                        };

    int arr1[2][3][3] = {
                        {
                            {1,2,3},
                            {4,5,6},
                            {7,8,9}
                        },
                        {
                            {1,2,3},
                            {4,5,6},
                            {7,8,9}
                        }
                        };

    for(int i=0; i<2; i++){
        for(int j=0; j<2; j++){
            printf("\n");
            for(int k=0; k<2; k++){
                printf("%d ",arr[i][j][k]);
            }
        }
    }

    printf("\n\n");

    for(int i=0; i<2; i++){
        // printf("\n");
        for(int j=0; j<3; j++){
            printf("\n");
            for(int k=0; k<3; k++){
                printf("%d ",arr1[i][j][k]);
            }
        }
    }
}
