class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int maxArea=0;
        int curr=0;//curr area 
        //for maximinzing the area , breadth should be maximum
        int i=0,j=n-1;

        while(i<j)
        {
            //min height x breadth
            curr=Math.min(height[i],height[j]) * (j-i);
            maxArea = Math.max(maxArea, curr);
            if(height[i]<height[j]) i++;
            else j--;
        }

        return maxArea;
    }
}