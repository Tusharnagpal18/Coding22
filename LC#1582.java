Given an m x n binary matrix mat, return the number of special positions in mat.
  
A position (i, j) is called special if mat[i][j] == 1 and all other elements in row i and column j are 0 (rows and columns are 0-indexed).

====================sol==========
  class Solution {
    public int numSpecial(int[][] mat) {
       int m=mat.length;
       int n=mat[0].length;
       int[] rCount=new int[m];
       int[] cCount=new int[n];
       int res=0;
       for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               if(mat[i][j]==1){
                   rCount[i]++;
                   cCount[j]++;
               }
           }
       }
       for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               if(mat[i][j]==1){
                   if(rCount[i]==1 && cCount[j]==1)
                     res++;
               }
           }
       }
       return res;
    }
}
