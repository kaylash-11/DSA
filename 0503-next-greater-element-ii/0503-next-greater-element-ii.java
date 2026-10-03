class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length-1;
        
        Stack<Integer> st=new Stack<>();
         for(int i=n;i>=0;i--)
         {
            st.push(nums[i]);
         }
        for(int i=n;i>=0;i--)
        {
            int val=nums[i];
            while(st.size()>0 && nums[i]>=st.peek())
            {
                st.pop();
            }
            if(st.size()==0) 
            {
                          
                nums[i]=-1;
                
            }
            else{
                
                nums[i]=st.peek();
            }
           st.push(val);
        }
        return nums;
    }
}