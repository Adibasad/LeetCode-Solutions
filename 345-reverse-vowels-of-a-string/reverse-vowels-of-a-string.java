class Solution {
    public String reverseVowels(String s) {

        //using two pointers
        char[] c = s.toCharArray();
        int i=0,j=s.length()-1;
        String v= "aeiouAEIOU";

        while(i<j)
        {   
            //find the vowel from start
            while(i<j && v.indexOf(c[i])==-1) i++;
            //from end
            while(i<j && v.indexOf(c[j])==-1) j--;

            //Swap the found vowels
            char temp = c[i];
            c[i] = c[j];
            c[j]=temp;

            i++;
            j--;
        }

        return new String(c);

    }

}