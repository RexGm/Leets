class Solution {
    public String addBinary(String a, String b) {
        int sum = 0, carry = 0;
        int lenA = a.length(), lenB = b.length();
        String result = "";
        for(int i = 1; true ; i++){
            if(lenA-i >= 0){
                sum+= a.charAt(lenA-i)-'0';
            }
            if(lenB-i >= 0){
                sum+= b.charAt(lenB-i)-'0';
            }
            sum+=carry;
            carry = sum/2;
            result += sum%2;
            sum = 0;
            if(lenA-i <= 0 && lenB-i <= 0){
                if(carry > 0){result+=carry;}
                break;
            }

        }
        return new StringBuilder(result).reverse().toString();
        
    }
}