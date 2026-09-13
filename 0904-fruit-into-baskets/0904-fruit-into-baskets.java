class Solution {
    public int totalFruit(int[] arr) {
       int n=arr.length;
       HashMap<Integer,Integer> map=new HashMap<>();
       int i=0;
       int j=0;
       int maxlen=0;
       int len=0;
       int key=0;
       while(j<n)
       {
         map.put(arr[j],j);
         if(map.size()>2)
         {
          for(int ele:map.keySet())
          {
            if(ele!=arr[j-1]&&ele!=arr[j])
            {
             key=ele;
            }
          }
          int idx=map.get(key);
          map.remove(key);
          i=idx+1;
         }
         len=j-i+1;
         maxlen=Math.max(maxlen,len);
         j++;
       } 
       return maxlen;
    }
}