class Solution {
    public boolean isPalindrome(String s) {
        String k = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < k.length(); i++){
            char ch = k.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')){
                sb.append(k.charAt(i));
        }
        }
        return sb.toString().equals(sb.reverse().toString());
    }
}