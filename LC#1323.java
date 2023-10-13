1323. Maximum 69 Number

You are given a positive integer num consisting only of digits 6 and 9.
Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).
----------sol---------
  class Solution {
    public int maximum69Number (int num) {
      
        char[] c=Integer.toString(num).toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]=='6'){
                 c[i]='9';
                 break;   
            }
        }
        return Integer.parseInt(new String(c));
    }
}
