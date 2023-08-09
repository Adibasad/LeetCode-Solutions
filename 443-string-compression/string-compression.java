class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        if(n==1) return 1;
        int ans=0;
        int count=1;
        char prev=chars[0];
        int i=0;
        //update the array--two pointers
        for(int j=1;j<n;j++)
        {
            // char curr=chars[j];
            if(prev==chars[j]) count++;
            else
            {
                chars[i++]=prev;
                prev=chars[j];

                //add count   
                if(count==1) continue;

                String s="";
                s+=count;
                char c[]=s.toCharArray();
                for(char a:c) chars[i++]=a;

                count=1;
            }

        }

        //for last element :)
        chars[i++]=prev;

        //add count   
        if(count==1) return i;
        String s="";
        s+=count;
        char c[]=s.toCharArray();
        for(char a:c) chars[i++]=a;



        return i;
    }
}