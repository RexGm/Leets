class Solution {
    public boolean isPalindrome(int x) {
         int temp, pd = 0;
         int num = x;
        while (true){
            if(num <= 0){
                if(x == pd){
                    return true;
                }
                return false;
            }
            temp = num % 10;
            num /=10; 
            pd = pd*10+ temp;
              
          
        }
    }
}