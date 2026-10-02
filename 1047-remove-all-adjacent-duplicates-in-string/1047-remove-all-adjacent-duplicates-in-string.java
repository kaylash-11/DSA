class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Character> st=new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
          if(st.size()==0) st.push(ch);
          else{
            if(ch==st.peek()) {
                st.pop();
            }
            else
            {
                st.push(ch);
            }
          }
        }
        while(st.size()>0)
        {
            sb.append(st.pop());
        }
        String ans=sb.reverse().toString();
        return ans;
        
    }
}