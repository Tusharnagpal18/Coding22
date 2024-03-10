Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
  ======sol===========
  class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
          return false;
        int ans[]=new int[26];
        for(char i:s.toCharArray())
           ans[i-'a']++;
        for(char i:t.toCharArray())
           ans[i-'a']--;
        for(int i:ans){
           if(i!=0){
            return false;      
           }
        }
    return true;
    }
}
