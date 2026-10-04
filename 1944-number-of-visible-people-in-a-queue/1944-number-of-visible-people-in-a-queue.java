class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n=heights.length-1;
       
        Stack<Integer> st=new Stack<>();
        st.push( heights[n]);
         heights[n]=0;
        for(int i=n-1;i>=0;i--)
        {
            int count=0;
            while(st.size()>0 && heights[i]>=st.peek())
            {
                count++;
                st.pop();
            }
            int val=heights[i];
            if(st.size()==0) heights[i]=count;
            else heights[i]=count+1;
            st.push(val);
        }
        return heights;
    }
}