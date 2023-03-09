326. Power of Three
Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3x.
  ====sol========
  class Solution {
    public boolean isPowerOfThree(int n) {
        int res=3;   
        if(n==1)
          return true;
        else if(n==0||n<0)
          return false;
        for(int i=1;i<35;i++){
          if(n==res)
            return true;
          res*=3;  
        }
        return false;    
    }
}
  
