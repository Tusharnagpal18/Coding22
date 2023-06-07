204. Count Primes
Given an integer n, return the number of prime numbers that are strictly less than n.
  
  ===============sol=============
  class Solution {
    public int countPrimes(int n) {
     if(n<=2)
       return 0;
       boolean ans[]=new boolean[n];
       int ctr=0;
       for(int i=2;i<=Math.sqrt(n);i++){
           if(ans[i]==false){
              //    marking all multiples of i as true 
               for(int j=i*i;j<n;j+=i){
                   ans[j]=true;
               }
           }
       }
       for(int i=2;i<n;i++){
           if(ans[i]==false)
             ctr++;
       }   
     return ctr;        
    }
}
