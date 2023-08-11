class Solution {
    public int maxVowels(String s, int k) {

        String v="aeiouAEIOU";
        Set<Character> set=new HashSet<>();
        for(char i:v.toCharArray()) set.add((Character)i);

        int count=0;
        
        //first window
        for(int i=0;i<k;i++) 
          if(set.contains((Character)s.charAt(i)))
            count++;  
        
        int max=count;

        int prev=0;
        int next=k-1;
        while(next<s.length()-1)
        {
            next++;
            if(set.contains((Character)s.charAt(next))) count++;

            if(set.contains((Character)s.charAt(prev))) count--;
            prev++;
            
            System.out.println(prev+" "+next+" "+count);
            max=Math.max(max,count);

        }

        return max;
    }
}