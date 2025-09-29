class Solution {
    public int romanToInt(String s) {
        int result = 0;



        for(int i = s.length()-1; i >= 0  ; i--){
            char target = s.charAt(i);
            int value = findValue(target);
 
            if(i <= 0){
                    result+=value;
                    return result;
            }
            int value1 =  findValue(s.charAt(i-1));
             if(value > value1){
                        result+= value - value1;
                        i--;
                    }else{result+=value;}
        } 
        return result;
    }

    public int findValue(char target){
        char[] chars = {'I','V','X','L','C','D','M'};
        int value = 1;
        for(int i = 0; i < chars.length ; i++){
            if(target == chars[i]){return value;}
            if(i % 2 == 0){value*=5;}
            else{value*=2;}
        }
        return 0;
    }
}