#include<stdio.h>
int main() {
    // Write C code here
    int arr1[3][3];
    int res[3][3];
    fflush(stdin);
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++){
            scanf("%d",&arr1[i][j]);
        }
    }
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            res[i][j]=arr1[j][i];
        }
    }
     for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
         printf("%d ",arr1[i][j]);
      }
      printf("\n");
    }
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
         printf("%d ",res[i][j]);
      }
       printf("\n");
    }
    return 0;
}
