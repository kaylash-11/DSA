class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
      while(i!=n)
      {
        if(map.containsKey(nums[i]))
        {
            int idx=i-map.get(nums[i]);
            if(idx<=k) return true;
        }
        map.put(nums[i],i);
        i++;
      }   
      return false;

    }
}