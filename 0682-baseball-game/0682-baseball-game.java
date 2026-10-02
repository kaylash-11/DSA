class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++)
        {
            String ch=operations[i];
            if(ch.equals("+"))
            {
                int a=st.pop();
                int b=st.pop();
                int c=a+b;
                st.push(b);
                st.push(a);
                st.push(c);
            }
            else if (ch.equals("C"))
            {
               st.pop();
            }
            else if(ch.equals("D")){
                int a=st.pop();
                int b=a*2;
                st.push(a);
                st.push(b);

            }
            else {
                int a=Integer.parseInt(ch);
                st.push(a);
            }
        }
        int sum=0;
        while(st.size()>0)
        {
            sum=sum+st.pop();
        }
        return sum;
    }
}