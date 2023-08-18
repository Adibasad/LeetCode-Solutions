class Solution {
    public String removeStars(String s) {

    StringBuilder ans= new StringBuilder();
    Stack<Character> stack = new Stack<>();

    //using stack to store the ele
    for(int i=0;i<s.length();++i)
    {
        char c = s.charAt(i);
        if(c == '*') stack.pop();
        else stack.push(c);
    }

    while(!stack.isEmpty()) ans.append(stack.pop());
    
    ans.reverse();
    return ans.toString();
}
}