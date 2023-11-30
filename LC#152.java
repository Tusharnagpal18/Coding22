Maximum Product Subarray
Given an integer array nums, find a 
subarray
 that has the largest product, and return the product.
The test cases are generated so that the answer will fit in a 32-bit integer. 
 
  ===============sol=============
  class Solution {
    public int maxProduct(int[] nums) {
         int curr=1,maxProd=Integer.MIN_VALUE;
         for(int i=0;i<nums.length;i++){
             curr*=nums[i];
             maxProd=Math.max(maxProd,curr);
             if(curr==0)
               curr=1;
         }
         curr=1;
         for(int i=nums.length-1;i>=0;i--){
             curr*=nums[i];
             maxProd=Math.max(maxProd,curr);
             if(curr==0)
               curr=1;
         }
        
         return maxProd;
         }
        
}
