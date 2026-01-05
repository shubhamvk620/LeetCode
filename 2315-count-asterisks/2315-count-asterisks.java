class Solution {
    public int countAsterisks(String s) {
        int bar = 0;
        int star = 0;
        for(char c : s.toCharArray()){
            if(c== '|'){
                bar++;
            }
            else if(c == '*' && bar %2 ==0){
                star++;
            }
        }
        return star;
    }
}