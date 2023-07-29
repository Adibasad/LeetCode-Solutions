class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        for (int i = 0; i < flowerbed.length && n>0; i++) {
            //dont check prev and next for 0th and n-1 index(out of bound)
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0)
                   && (i == flowerbed.length-1 || flowerbed[i+1] == 0) ) {
                // flowerbed[i] =1;      
                i++;
                n--;
                }
        }
        

        // System.out.println(Arrays.out.println(flowerbed));
        return n==0;
        

    }
}