class Solution {
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        char[] c = s.toCharArray();
        for(int i = 0; i < c.length; i++){
            if(c[i] != 'i'){
                sb.append(c[i]);
            }else{
                sb.reverse();
            }
        }
        return sb.toString();
    }
}