class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> s= new Stack<>();

        for(int i=0;i<asteroids.length;i++)
        {
            if(!s.isEmpty() && s.peek()>0 && asteroids[i]<0)
            {
                //if the sizes are equal
                if(Math.abs(asteroids[i])== Math.abs(s.peek())) s.pop();

                //the current asteroid is bigger in size
                else if (Math.abs(asteroids[i]) > Math.abs(s.peek()))
                {
                    s.pop();
                    i--; //in next loop,the asteroid value will be same 
                }

            }

            //if no coliision or stack is empty
            else s.push(asteroids[i]);
          
        }

        int[] ans = new int[s.size()];
        for (int i = ans.length - 1; i >= 0; i--) ans[i] = s.pop();
        
        
        return ans;
  
        
    }


}