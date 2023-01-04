Write a program that prints the number of times you must carry a digit when you sum together two integers.

(36, 135) ➞ 1 (671, 329) ➞ 3

Input Format

Two integer inputs N and M

Constraints

0<=N,M<=10^6

Output Format
answer in integer
============================ Ans=================
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),r1,r2,sum=0;
        int m=s.nextInt(),ctr=0;
        int d=0;
        while(n>0 && m>0){
          sum=0;
          r1=n%10;
          r2=m%10;
            
          sum=r1+r2+d;
            if(sum>=10){
                ctr++;
                d=1;
            }
            else
                 d=0;
            n/=10;
            m/=10;     
        }
        System.out.println(ctr);
    }
}
