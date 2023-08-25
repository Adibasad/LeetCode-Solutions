class Solution {
    public String decodeString(String s) {
        Stack numStack=new Stack();
        Stack<StringBuilder> ssb = new Stack();
        StringBuilder str = new StringBuilder();
        int n=0;

        for(char c:s.toCharArray())
        {
            //is a number
            if(c >= '0' && c <= '9') n=(n*10)+ c-'0';

            else if(c=='[')
            {
                ssb.push(str);
                str=new StringBuilder();
                numStack.push(n);
                n=0;
            } 
            else if(c==']')
            {
                //temp str
                StringBuilder temp=str;
                str= ssb.pop();
                int count=(int)numStack.pop();
                while(count-- >0) str.append(temp);

            }
            else str.append(c);
        }


        return str.toString();
    }
}