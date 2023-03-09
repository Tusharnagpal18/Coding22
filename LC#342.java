Given an integer n, return true if it is a power of four. Otherwise, return false.

An integer n is a power of four, if there exists an integer x such that n == 4x.
  
========sol===============
class Solution {
    public boolean isPowerOfFour(int n) {
        int res=4;
        if(n==1){
            return true;
        }
        else if(n<0||n==0){
            return false;
        }
        for(int i=1;i<30;i++){
            if(res==n){
                return true;
            }
            res*=4;
        }
        return false;
    }
}
