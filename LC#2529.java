//2529. Maximum Count of Positive Integer and Negative Integer
Given an array nums sorted in non-decreasing order, return the maximum between the number of positive integers and the number of negative integers.

In other words, if the number of positive integers in nums is pos and the number of negative integers is neg, then return the maximum of pos and neg.
Note that 0 is neither positive nor negative.

===================Solution==========
    
class Solution {
    public int maximumCount(int[] nums) {
        int pn=0,nn=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0)
                nn++;
            else if(nums[i]>0)
                pn++;
            
        }
        return (nn>pn?nn:pn);
    }
}
