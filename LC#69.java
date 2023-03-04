Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.
=============SOL============

class Solution {
    public int mySqrt(int x) {    
        long i=0,check=0;
        if(x==1){
            return 1;
        }
        for(i=0;i<=x/2;i++)
        {  
            check = i * i;
            if(check == x){
                return (int)i;
            }
            if(check>x){
                return (int)i-1;
            }
        }
        return (int)i-1;
    }
}
