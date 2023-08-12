class Solution {
    public int longestOnes(int[] nums, int k) {
        int start=0,end=0;
        int zero=0;

        while(end<nums.length)
        {
            // System.out.println(start+" "+end+" "+k);
            if(nums[end]==0) zero++;
            
            if(zero>k)
            {
                if(nums[start]==0) zero--;
                start++;
            }
            
            end++;
        }

        return end-start;
        

        


    }
}