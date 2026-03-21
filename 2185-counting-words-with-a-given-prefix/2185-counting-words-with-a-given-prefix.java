class Solution {
    public int prefixCount(String[] words, String pref) {
        int ans = 0;

        for(String word : words){
            boolean present = true;

            if(word.length() >= pref.length()){
                for(int i = 0; i < pref.length(); i++){
                    if(pref.charAt(i) != word.charAt(i)){
                        present = false;
                        break; 
                    }
                }
            } else {
                present = false;
            }

            if(present){
                ans++;
            }
        }
        return ans;
    }
}