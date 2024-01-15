1351. Count Negative Numbers in a Sorted Matrix
                --------------sol---------------------------- 
class Solution 
{
    public int countNegatives(int[][] grid) {
        int len=grid.length,ctr=0;
        for(int i=0;i<len;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]<0)
                  ctr++;
            }
        }
        return ctr;
    }
}
