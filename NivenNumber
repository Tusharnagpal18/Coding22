---Question---
Niven numbers are positive integers greater than 0 that are divisible by the sum of their digits.

Print 1 if entered number is Niven, otherwise 0.
==============solution==========
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int num=s.nextInt(),rem=0,sum=0;
        int n=num;
        while(n>0){
            rem=n%10;
            sum+=rem;
            n/=10;
        }
        if(num%sum==0){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
