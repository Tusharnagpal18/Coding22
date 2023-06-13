Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<Character>();
        for(char c:s.toCharArray()){
            if(c=='(' || c=='{' || c=='[')
               st.push(c);
            else{
                if(st.isEmpty())
                   return false;
              
             char top=st.peek();
                if((c==')' && top=='(') ||(c=='}' && top=='{') || (c==']' && top=='['))
                {
                st.pop();   
                }   
                else{
                    return false;
                }
            }
        }
       return st.isEmpty();           
    }
}
