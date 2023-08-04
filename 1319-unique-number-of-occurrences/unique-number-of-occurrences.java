class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int x:arr)
        {
            if(map.containsKey(x)) map.put(x,map.get(x)+1);
            else map.put(x,1);
        }
        
        Set<Integer> s=new HashSet<>();
        //unique value
        for(int v:map.values())
        {
            if(s.contains(v)) return false;
            s.add(v);
        }
        return true;
    }
}