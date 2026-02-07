class Solution {
    public static void letterCombinations(String digits,List<String> ans,  HashMap<Integer,String> map, String curr,int i){
        if( i == digits.length()){
            ans.add(curr);
            return;
        }
        String temp = map.get(digits.charAt(i)-'0');
        for(int j = 0; j < temp.length(); j++){
            letterCombinations(digits, ans, map, curr+temp.charAt(j), i+1);
        }
    }
    public List<String> letterCombinations(String digits) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(0,"");
        map.put(1,"");
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        List<String> ans =new ArrayList<>();
        String curr = "";
        letterCombinations(digits, ans, map, curr, 0);
        return ans;
    }
}