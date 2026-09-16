class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int i=0;
        int j=n-1;
        int count=0;
        while(i<j)
        {
            if(nums[i]!=val)  i++;
            else if(nums[j]==val) j--;
            else{
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
        }
        for(i=0;i<n;i++)
        {
            if(nums[i]==val) break;
            count++;
        }
        return count;
    }
}