class Solution {
    public boolean isPalindrome(int x) {
        int i=x;
        int rev=0;

        while(i>0)
        {
            int r=i%10;
            rev=(rev*10)+r;
            i=i/10;
        }
        if(x==rev) return true;
        else return false;
    }
}