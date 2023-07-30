class Solution {
    public String reverseWords(String s) {
        String [] strArr=s.trim().split("\\s+");
        String ans="";
        // System.out.println(Arrays.toString(strArr));

        //so it does not add the space in the last part
        for(int i=strArr.length-1;i>0;i--) ans+=strArr[i]+ " ";
            
        return ans+ strArr[0];
    } 
}