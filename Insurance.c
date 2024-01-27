//Experiment 1 
//Question 1                     
//lab-file-MCA
// BASIC HEADER FILES
#include<stdio.h>
#include<conio.h>

void main()
{
 int age;
 long insur=0,finalIns=0,in=0;
 char gender,smoke;
 clrscr();
 printf("Enter age\n");
 scanf("%d",&age);
 fflush(stdin);
 printf("Enter your gender (M/F)\n");
 scanf("%c",&gender);
 fflush(stdin);
 printf("Do you smoke? (Y/N)\n");
 scanf("%c",&smoke);
 if(age>=21 && age<=30)
 {
   insur=10000;
 }
 else if(age>=31 && age<=40)
 {
 insur=15000;
 }
 else if(age>=41 && age<=50)
 {
   insur=20000;
 }
 else if(age>=51 && age<=60)
 {
 insur=40000;
 }
 else
 {
   printf("Insurance is not possible");
   getch();
 }
 if(gender=='f'|| gender=='F')
 {
   in=(insur*10)/100;
   finalIns=insur-in;
 }
 else{
  finalIns=insur;
 }
 if(smoke=='y' || smoke=='Y')
 {
   in=(finalIns*10)/100;
   finalIns+=in;
 }
 printf("Your Insurance amount is Rs %d",finalIns);
 getch();
}
