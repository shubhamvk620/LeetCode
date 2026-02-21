class Solution {
    public boolean isPalindrome(String s) {
        String k = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < k.length(); i++){
            char ch = k.charAt(i);
            //agar character letter ya digit hai toh hi append krna sirf
             if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
        }
        }
        // comparing reverse
        return sb.toString().equals(sb.reverse().toString());
    }
}