class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        // System.out.println(map);

        int count=0;
        int low=0,high=nums.length-1;

        while(low<high)
        {
            if(nums[low]+nums[high]==k) {
                count++;
            low++;
            high--;
            }
            else if(nums[low]+nums[high]>k) high--;
            else low++;
        }

        return count;


        
    }
}