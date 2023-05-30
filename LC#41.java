41. First Missing Positive

Given an unsorted integer array nums, return the smallest missing positive integer.

You must implement an algorithm that runs in O(n) time and uses constant extra space.
  ======sol======
  class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> li=new HashSet<Integer>();
        int i=0;
        for(i=0;i<nums.length;i++)
            li.add(nums[i]);
        for(i=0;i<nums.length;i++){
            if(!li.contains(i+1))
               return i+1;
        }
        return (i+1);    
    }
}
