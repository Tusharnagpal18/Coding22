 ---- Median of Two Sorted Arrays-----
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).
------------sol---------
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int tot=nums1.length+nums2.length,i,k=0,val=0,t=0;
        double rest=0;
        int res[]=new int[tot];
        for(i=0;i<nums1.length;i++){
             res[i]=nums1[i];
        }
        for(k=0;k<nums2.length;i++,k++){
          res[i]=nums2[k];
        }
        if(tot%2==0){
          Arrays.sort(res);
              val=tot/2;
              rest=(double)(res[val]+res[val-1])/2;
              return rest;
        }
        else{
          Arrays.sort(res);
            val=tot/2;
            rest=res[val]; 
            return (double)rest;
        }
    }
}
 
