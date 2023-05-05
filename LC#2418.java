2418. Sort the People
You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.

For each index i, names[i] and heights[i] denote the name and height of the ith person.

Return names sorted in descending order by the people's heights
  class Solution {
    public String[] sortPeople(String[] names, int[] ht) {
     int tp=0;
     String temp=null;
        for(int i=0;i<ht.length;i++){
            for(int j=0;j<ht.length-i-1;j++){
                if(ht[j]<ht[j+1]){
                  tp=ht[j];
                  ht[j]=ht[j+1];ll
                  ht[j+1]=tp;
                  temp=names[j];
                  names[j]=names[j+1];
                  names[j+1]=temp;
                }
            }              
        }
        return names;
    }
}
