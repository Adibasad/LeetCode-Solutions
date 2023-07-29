class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> ans=new ArrayList<>();
        //max in array
        int max= Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++)
        {
            max=Math.max(max,candies[i]);
        }

        
        for(int i=0;i<candies.length;i++)
        {
            
            if(candies[i]+extraCandies >=max) ans.add(true);
            else ans.add(false);

        }

        return ans;
    }
}