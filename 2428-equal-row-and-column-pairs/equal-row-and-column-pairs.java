class Solution {
    public int equalPairs(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;

        int count=0;

        for(int k=0;k<row;k++)
        {
            //get the row
            List<Integer> list= IntStream.of(grid[k]).boxed().collect(Collectors.toList());
            //  System.out.println(list);
             //match all the colums
            for(int i=0;i<row;i++)
            {
                boolean f=false;
                int temp=0;
               for(int j=0;j<col;j++)
               {
                //    System.out.println(grid[j][i]+" "+list.get(j));
                    if(f) continue;
                    if(grid[j][i]==list.get(j)) temp++;
                    else f=true;
               }
               if(temp==row) count++;
            }

        }

        return count;
    }
}