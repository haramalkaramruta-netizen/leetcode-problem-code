class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        
        int temp=x;
        int rev = 0;
        for (; x != 0; x /= 10) {
            int pop = x % 10;
            rev = rev * 10 + pop;
        }
        if(rev==temp){
            return true;
        }
        return false;
    }
}