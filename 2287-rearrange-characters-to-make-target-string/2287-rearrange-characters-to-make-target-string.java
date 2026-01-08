class Solution {
    public int rearrangeCharacters(String s, String target) {
        // one map for string and one for target
        HashMap<Character,Integer> mapS = new HashMap<>();
         HashMap<Character,Integer> mapT = new HashMap<>();
        //string ka map
        for(char c : s.toCharArray()){
            mapS.put(c, mapS.getOrDefault(c , 0)+1);
        }
        //target ka map
        for(char t : target.toCharArray()){
            mapT.put(t, mapT.getOrDefault(t, 0)+1);
        }

        int ans = Integer.MAX_VALUE;
        //char k me target  ka map ka key ka set daalo, means no duplicte only single
        for(char k : mapT.keySet()){
            if(!mapS.containsKey(k)) {return 0;}//agar target's key-> String's key me nhi hai means 
            else{                               //  char missing hai then target can't achieved. 
                int count = mapS.get(k)/mapT.get(k);//if present then whats min value 
                ans = Math.min(ans, count);
            }
        }
        return ans;
    }
}