class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n=nums.length;
        int one = Integer.MAX_VALUE, two = Integer.MAX_VALUE;

       
        for(int val:nums)
        {
            if(val <=one) one=val;

            else if(val <=two) two=val;
            //at third time if one and two are filled then
            else if(val >two) return true;
        }
        
        
        return false;
    }
}