class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length())return -1;
        char[] hay = haystack.toCharArray();
        for(int i = 0; i <= hay.length - needle.length(); i++){
             StringBuilder sb = new StringBuilder();
            for(int j = i; j < i+needle.length(); j++){
                sb.append(hay[j]);
            }
            if(sb.toString().equals(needle)) return i;
        }
        return -1;
    }
}