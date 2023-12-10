Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
  ===============sol=============
  class Solution {
    public String reverseWords(String s) {
        int k=s.length()-1,j=0;
        StringBuilder sb=new StringBuilder();
        while(k>=0){
            while(k>=0 && s.charAt(k)==' '){
              k--;
            }
              j=k;
              if(k<0) break;

              while(k>=0 && s.charAt(k)!=' ')
               k--;

               if(sb.isEmpty()){
                   sb.append(s.substring(k+1,j+1));
               }
               else{
                   sb.append(" "+s.substring(k+1,j+1));
               }

        } 
        return sb.toString();
    }
}
