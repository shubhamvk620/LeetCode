class Solution {
    public String reverseVowels(String s) {
        //putting vowels in Arraylist
        List<Character>list = new ArrayList<>();
        list.add('a'); list.add('A'); list.add('e'); list.add('E'); list.add('i'); list.add('I');
         list.add('o'); list.add('O'); list.add('u'); list.add('U');

        //pointers
         int i = 0;
        int j = s.length()-1;
        //create character array in which string is inserted for performimg swaping
        char[] charArray = s.toCharArray();

        while(i < j){
            if(list.contains(s.charAt(i)) && list.contains(s.charAt(j))){
               char temp = charArray[i]; 
                charArray[i] = charArray[j];
                charArray[j] = temp;
                i++;j--;
            } else if(list.contains(s.charAt(i)) && !list.contains(s.charAt(j))){
                j--;
            }else{
                i++;
            }
        }
        //converting character Array back to string becs return type string 
        String result = new String(charArray);
        return result;
    }
}