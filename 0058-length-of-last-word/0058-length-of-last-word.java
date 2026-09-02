class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        s=s.trim();
        int i=s.length()-1;
        while(i>=0)
        {
         if(s.charAt(i)==' ') break;
         count++;
         i--;
        }
        return count;
    }
}