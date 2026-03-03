class Solution {
    public String addStrings(String num1, String num2) {
        char[] n1 = num1.toCharArray();
        char[] n2 = num2.toCharArray();
        int carry = 0;
        int i = n1.length-1; //2
        int j = n2.length-1; //3
        StringBuilder sb = new StringBuilder();
        while(i >= 0 && j >=0){
            sb.append(((n1[i]-'0') + (n2[j]-'0') + carry) % 10);
            carry = ((n1[i]-'0') + (n2[j]-'0' + carry)) / 10;
            i--;
            j--;
        }

       while(i >=0){
    int sum = (n1[i]-'0') + carry;
    sb.append(sum % 10);
    carry = sum / 10;
    i--;
      }

        while(j >=0){
    int sum = (n2[j]-'0') + carry;
    sb.append(sum % 10);
    carry = sum / 10;
    j--;
}
        if(carry > 0){
        sb.append(carry);}

        return sb.reverse().toString();
    }
}