1464. Maximum Product of Two Elements in an Array
Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).

===========SOL=======
class Solution{
    
// max product function to solve question
public int maxProduct(int[] nums) {
    int max1 = Integer.MIN_VALUE,max2 = Integer.MIN_VALUE; 
    for(int n:nums){
        if(n>max1){
            max2 = max1;
            max1 = n;  
        }
        else if(n>max2)
            max2 = n; 
    }
    return (max1-1)*(max2-1);
 }
}
