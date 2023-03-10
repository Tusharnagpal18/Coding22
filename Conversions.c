//decimal to octal

#include<stdio.h>
int main(){
    int num;
    printf("Enter a number\n");
    scanf("%d",&num);
    printf("Octal = %o",num);
    printf("Number for coversion to decimal from octal\n");
    scanf("%o",&num);
    printf("%d",num);
    return 0;
}
//decimal to hexa
#include<stdio.h>
int main()
{
    int num;
    printf("Enter the number to convert to hexadecimal\n");
    scanf("%d",&num);
    printf("hexadecimal = %x\n",num);
    printf("Enter number to convert to hexadecimal ");
    scanf("%x",&num);
    printf("%d",num);
}
