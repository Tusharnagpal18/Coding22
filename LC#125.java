Valid Palindrome
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

    
Given a string s, return true if it is a palindrome, or false otherwise.
--------------sol---------------
class Solution {
    public boolean isPalindrome(String s) {
        int start=0,end=s.length()-1;
        while(start<=end){
            char cFirst=s.charAt(start);
            char cLast=s.charAt(end);
            if(!Character.isLetterOrDigit(cFirst))
               start++;
            else if(!Character.isLetterOrDigit(cLast))
               end--;
            else{
                if(Character.toLowerCase(cFirst)!=Character.toLowerCase(cLast)){
                    return false;
                }
            start++;
            end--;      
            }
        }
        return true;
    }
}
