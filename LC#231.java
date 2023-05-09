Given an integer n, return true if it is a power of two. Otherwise, return false.
    
An integer n is a power of two, if there exists an integer x such that n == 2x.

---------------sol--------------
class Solution {
    public boolean isPowerOfTwo(int n) {
        int res=2;
        if(n==1)
          return true;
        else if(n==0 || n<0)
          return false;  
        for(int i=1;i<40;i++){
            if(n==res)
              return true;
            res*=2;
        }  
        return false;  
    }
}
