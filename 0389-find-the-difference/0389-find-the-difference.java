class Solution {
    public char findTheDifference(String s, String t) {
        List<Character>list = new ArrayList<>();

        for(char c : s.toCharArray()){
            list.add(c);
        }
       for(char l : t.toCharArray()){
        if(list.contains(l)){ 
            list.remove((Character)l); //if char is present then remove it from list, so to find extra char
        }else{
             return l;
        }
       }
       return '\0';
    }
}