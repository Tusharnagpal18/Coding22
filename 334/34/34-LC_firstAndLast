34 Leet code
class Solution {
     public int[] searchRange(int[] nums,int target){
        int sol[]={-1,-1};
        int start=binaryS(nums,target,true);
        int end=binaryS(nums,target,false);
        sol[0]=start;
        sol[1]=end;
        return sol;
    }
    public static int binaryS(int a[],int target,boolean findStartIndex){
        int start=0,end=a.length-1,mid=0;
        int ans=-1;
        while(start<=end)
        {
            mid=start+(end-start)/2;
                if(target>a[mid]){
                    start=mid+1;
                }
                else if(target<a[mid])
                {
                    end=mid-1;
                }
                else{
                        ans= mid;
                        if(findStartIndex)
                        {
                            end=mid-1;
                        }
                        else{
                            start=mid+1;
                        }
                }
            }
       return ans;
    }
}
