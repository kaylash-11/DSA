class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        int count=0;
        while(j<n)
        {
            map.put(s.charAt(j),j);
            if(map.size()==3)
            {
                int idx=Math.min(map.get('a'),(Math.min(map.get('b'),map.get('c'))));
                count=count+(idx+1);
            }
            j++;
        }
        return count;
    }
}