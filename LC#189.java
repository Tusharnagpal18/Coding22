189. Rotate Array
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative. 
 
 ========sol====================
  class Solution {
    public void rotate(int[] nums, int k) {
        int[] temp=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            temp[(i+k)%nums.length]=nums[i];
        }
        for(int j=0;j<temp.length;j++)
           nums[j]=temp[j];      
    }
}
