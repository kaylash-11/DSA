class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int sum=0;
        int maxsum=0;
        for(int i=0;i<k;i++)
        {
         sum=sum+cardPoints[i];
        }
        maxsum=sum;
        int j=n-1;
        for(int i=k-1;i>=0;i--)
        {
            sum=sum-cardPoints[i]+cardPoints[j];
            j--;
            maxsum=Math.max(maxsum,sum);
        }
        return maxsum;
    }
}