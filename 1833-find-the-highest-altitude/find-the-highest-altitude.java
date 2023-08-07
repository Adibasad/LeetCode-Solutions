class Solution {
    public int largestAltitude(int[] gain) {
        int PrefixSum=0;
        int max=0;
        for(int i:gain)
        {
            PrefixSum+=i;
            max=Math.max(max,PrefixSum);
        }
        return max;
    }
}