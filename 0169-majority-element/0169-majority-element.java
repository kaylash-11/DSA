class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int i=0;
        int j=0;
        int count=0;
        int maxelement=0;
        while(j!=n)
        {
            if(nums[i]==nums[j])
            {
                count++;
                j++;
            }
            else
            {
                if(count>n/2)
                {
                    maxelement=nums[i];
                }
                i=j;
                count=0;
            }
        }
        if(j==n)
        {
            if(count>n/2)
            {
                maxelement=nums[i];
            }
        }
        return maxelement;
    }
}