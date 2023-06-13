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
