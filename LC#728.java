728. Self Dividing Numbers
A self-dividing number is a number that is divisible by every digit it contains.
    
For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
A self-dividing number is not allowed to contain the digit zero.

Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right]
========sol=========
    
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
         int res=0,ctr=0;
         List<Integer> lt=new ArrayList<Integer>();
           for(int i=left;i<=right;i++){
                res=i;
                while(res!=0){
                        int r=res%10;
                        if(r==0){
                        ctr=1;
                        break;
                    }
                    else if(i%r!=0){
                        ctr=1;
                        break;
                    }
                    res/=10; 
                }
                if(ctr==0)
                    lt.add(i);
             ctr=0;  
        } 
        return lt;   
    }
}
