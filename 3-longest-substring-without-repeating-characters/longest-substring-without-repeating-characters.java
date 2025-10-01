class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int lenS = s.length();
        for(int i = 0; lenS-i >= max ; i++){
            if(counter(i, lenS,s) > max){
                max = counter(i,lenS,s);
            }
        }
        return max;
    }

    public int counter(int index, int len,String s){
       int count = 0;
       String result = "";
        for(int i = index;  i < len; i++){
            if(!result.contains( String.valueOf(s.charAt(i)))){
                count+=1;
                result+= s.charAt(i);
            }else{return count;}

        
        }
        return count;
    }
}