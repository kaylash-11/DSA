class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        char[] arr =s.toCharArray();
        st.push('1');
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]==')' && st.peek()=='(')
           {
            st.pop();
           }
           else if(arr[i]=='}'&& st.peek()=='{'){
            st.pop();
           }
           else if(arr[i]==']'&& st.peek()=='['){
            st.pop();
           }
           else{
            st.push(arr[i]);
           }
        }
        st.pop();
        if(st.size()==0) return true;
        else return false;
    }
}