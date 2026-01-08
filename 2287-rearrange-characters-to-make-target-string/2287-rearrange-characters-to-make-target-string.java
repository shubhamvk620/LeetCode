class Solution {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character,Integer> mapS = new HashMap<>();
         HashMap<Character,Integer> mapT = new HashMap<>();

        for(char c : s.toCharArray()){
            mapS.put(c, mapS.getOrDefault(c , 0)+1);
        }
        for(char t : target.toCharArray()){
            mapT.put(t, mapT.getOrDefault(t, 0)+1);
        }

        int ans = Integer.MAX_VALUE;
        
        for(char k : mapT.keySet()){
            if(!mapS.containsKey(k)) {return 0;}
            else{
                int count = mapS.get(k)/mapT.get(k);
                ans = Math.min(ans, count);
            }
        }
        return ans;
    }
}