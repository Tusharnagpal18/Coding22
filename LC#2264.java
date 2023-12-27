You are given a string num representing a large integer. An integer is good if it meets the following conditions:

It is a substring of num with length 3.
It consists of only one unique digit.
Return the maximum good integer as a string or an empty string "" if no such integer exists.

Note:
A substring is a contiguous sequence of characters within a string.
There may be leading zeroes in num or a good integer.
  ====================sol================
  class Solution {
    public String largestGoodInteger(String num) {
        String res="";
        for(int i=2;i<num.length();i++)
            if(num.charAt(i)==num.charAt(i-1) && num.charAt(i)==num.charAt(i-2))
                if(num.substring(i-2,i+1).compareTo(res)>0)
                    res=num.substring(i-2,i+1); 
        return res;
    }
}
