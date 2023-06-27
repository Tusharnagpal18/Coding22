                    Count the Digits That Divide a Number

Given an integer num, return the number of digits in num that divide num.

An integer val divides nums if nums % val == 0.

                      
--------------Solution-------

class Solution {
    public int countDigits(int num) {
        int num2=num,r=0,ctr=0;
        while(num!=0){
            r=num%10;
            if(num2%r==0)
               ctr++;
            num/=10;   
        }
        return ctr;
    }
}
