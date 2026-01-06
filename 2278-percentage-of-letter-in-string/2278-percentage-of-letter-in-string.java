class Solution {
    public int percentageLetter(String s, char letter) {
        List<Character>list = new ArrayList<>();
        int c = 0;
        for(char ch : s.toCharArray()){
            list.add(ch);
        }
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == letter){c++;}
        }
        return (c*100)/list.size();
    }
}