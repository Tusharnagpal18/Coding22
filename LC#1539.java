                                                                           1539. Kth Missing Positive Number
                                                                           
Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Return the kth positive integer that is missing from this array.
 ============SOL==========
 class Solution {
    public int findKthPositive(int[] arr, int k) {
     int ctr=0,j=0;
     for(int i=1;i<2001;i++){
           if(arr[j]!=i){
             ctr++;
           }
           else if(j<arr.length-1) {
                   j++;  
           }
           if(ctr==k){
             return i;   
           }
     }
    return 0; 
  }
}
