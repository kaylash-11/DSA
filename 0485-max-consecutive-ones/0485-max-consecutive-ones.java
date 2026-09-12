class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int n=nums.length;
       int count=0;
       int maxlen=0;
       int i=0;
       int j=0;
       while(j<n)
       {
        if(nums[j]==1)
        {
            count++;
        }
        else{
            maxlen=Math.max(maxlen,count);
            count=0;
            i=j;
        
        }
        j++;
       } 
       if(j==n) maxlen=Math.max(maxlen,count);
       return maxlen;
    }
}