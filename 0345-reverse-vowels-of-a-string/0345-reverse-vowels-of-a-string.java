class Solution {
    public String reverseVowels(String s) {
        char[] ch=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            char m=Character.toLowerCase(ch[i]);
            char n=Character.toLowerCase(ch[j]);
            if(m!='a'&& m!='e'&& m!='i' && m!='o' && m!='u') 
            {
                i++;
            }
            else if(n!='a'&& n!='e'&& n!='i' && n!='o' && n!='u')
            {
               j--;
            }
            else
            {
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }
        }
        s= String.valueOf(ch);
        return s;
    }
}