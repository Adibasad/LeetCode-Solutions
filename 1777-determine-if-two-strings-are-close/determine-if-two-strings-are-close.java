class Solution {
    public boolean closeStrings(String w1, String w2) {
        if(w1.length()!=w2.length()) return false;

        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();

        HashMap<Character, Integer> map1=new HashMap<>();
        HashMap<Character, Integer> map2=new HashMap<>();

        //mapping
        for(int x=0;x<w1.length();x++)
        {
            Character c=(Character)w1.charAt(x);
            if(map1.containsKey(c)) map1.put(c,map1.get(c)+1);
            else map1.put(c,1);
        }
        for(int x=0; x<w2.length();x++)
        {
           Character c=(Character)w2.charAt(x);
            if(map2.containsKey(c)) map2.put(c,map2.get(c)+1);
            else map2.put(c,1);
        }

        System.out.println(map1);
        System.out.println(map2);

        //checking for charecters presence
        for(Character k:map1.keySet())
        {
            // System.out.println(k+" "+map2.containsKey(k));
            if(map2.containsKey(k)) {list1.add(map1.get(k));
            System.out.println(map1.get(k));}
            else return false;
        }

        for(Character k:map2.keySet())
        {
            if(map1.containsKey(k)) {list2.add(map2.get(k));
            System.out.println(map2.get(k));}
            else return false;
        }

        //sort the lists
        Collections.sort(list1);
        Collections.sort(list2);

        //comparing values of chars
        return list1.equals(list2);


    }
}