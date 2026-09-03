class Solution {
    public int compress(char[] chars) {
      String s="";
      int i=0;
      int j=0;
      int count=0;
      int size=chars.length;
      while(j!=size)
      {

        if(chars[i]==chars[j])
        {
          count++;
          j++;
        }
        else
        {
           if(count==1) s+=chars[i];
           else{
            s+=chars[i];
            s+=count;
           }
            i=j;
            count=0;
        }
        }
      

      if(j==size)
      {
         if(count==1) s+=chars[i];
           else{
            s+=chars[i];
            s+=count;
           }
      }
         
       for( i=0;i<size;i++)
       {
          if(i<s.length())
          {
            chars[i]=s.charAt(i);
          }
       }
      return s.length();
    }
}