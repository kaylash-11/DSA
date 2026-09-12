class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        int maxlen=0;
        int len=0;
        int flag=0;
        while(j<n)
        {
            if(map.containsKey(s.charAt(j)))
            {
              int idx=map.get(s.charAt(j));
              
              flag=1;
              if(idx>=i)
              i=idx+1;

            }
            map.put(s.charAt(j),j);
            len=j-i+1;
            maxlen=Math.max(maxlen,len);    
            j++;
            
        }
     return maxlen;
    }
}