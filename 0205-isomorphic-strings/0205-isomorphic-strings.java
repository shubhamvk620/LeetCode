class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character,Character>map = new HashMap<>();
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        int i = 0, j = 0;

        while(i < s1.length && j < t1.length){
            if(map.containsKey(s1[i])){
                if(map.get(s1[i]) != t1[j]){return false;}
            } else if(map.containsValue(t1[j])){
               {return false;}
            }else{
                map.put(s1[i],t1[j]);
               
            }
             i++;j++;
        }
        return true;
    }
}