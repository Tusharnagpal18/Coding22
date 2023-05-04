//1528. Shuffle String
you are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
----sol-------
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] str=new char[s.length()];
        for(int i=0;i<s.length();i++){
            str[indices[i]]=s.charAt(i);
        }
        return new String(str);
    }
}
