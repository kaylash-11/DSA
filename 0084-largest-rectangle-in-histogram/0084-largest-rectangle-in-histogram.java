class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<Integer> prev=new Stack<>();
        Stack<Integer> next=new Stack<>();
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        n=n-1;
        for(int i=n;i>=0;i--)
        {
           while(next.size()>0 && heights[i]<=heights[next.peek()])
           {
            next.pop();
           }
           if(next.size()==0)  arr1[i]=n+1;
           else arr1[i]=next.peek();
           next.push(i);
        }

         
        for(int i=0;i<=n;i++)
        {
           while(prev.size()>0 && heights[i]<=heights[prev.peek()])
           {
            prev.pop();
           }
           if(prev.size()==0)  arr2[i]=-1;
           else arr2[i]=prev.peek();
           prev.push(i);
        }

        int maxArea=0;
        for(int i=0;i<=n;i++)
        {
            int area=heights[i]*(arr1[i]-arr2[i]-1);
            if(maxArea<area) maxArea=area;
        }
      
      return maxArea;

    }
}