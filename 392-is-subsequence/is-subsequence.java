class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        int c=0;
        if(s.length()==0 && t.length()==0) return true;
        if(t.length()==0) return false;
        
        // System.out.println(t.charAt(j));
        while(i<s.length() && j<t.length())
        {
            // System.out.println(i+" "+j);
            if(s.charAt(i) == t.charAt(j))
            {
                i++;
                j++;
                c+=1;
            }
            else j++;
            
        }

        if(s.length()==c) return true;
        return false;
    }
}