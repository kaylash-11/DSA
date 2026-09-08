class Solution {
    public boolean isPalindrome(String s) {
      StringBuilder  sb=new StringBuilder();
      int n=s.length();
      for(int i=0;i<n;i++)
      {
        char ch=s.charAt(i);

        if(Character.isLetter(ch) || Character.isDigit(ch))
        {
           ch= Character.toLowerCase(ch);
           sb.append(ch);
        }
      }
      int i=0,j=sb.length()-1;
      while(i<j)
      {
        if(sb.charAt(i)!=sb.charAt(j)) return false;
        i++;
        j--;
      }
      return true;
    }
}