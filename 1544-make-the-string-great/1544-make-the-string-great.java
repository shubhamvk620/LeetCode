class Solution {
    public String makeGood(String s) {
        if(s.length() == 1) return s;

        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        sb.append(ch[0]);

        for(int i = 1; i < ch.length; i++){
            char c = ch[i];

            if(sb.length() > 0){
                char k = sb.charAt(sb.length() - 1);

                if(Math.abs(c - k) == 32){
                    sb.deleteCharAt(sb.length() - 1);
                }
                else{
                    sb.append(c);
                }
            } 
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}