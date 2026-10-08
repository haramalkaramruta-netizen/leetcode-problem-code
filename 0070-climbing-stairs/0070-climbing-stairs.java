class Solution {
    public int climbStairs(int n) {
        // Base cases
        if (n == 1) return 1;
        if (n == 2) return 2;
        
        // Variables to store the ways to reach the previous two steps
        int first = 1;
        int second = 2;
        
        // Iteratively calculate ways for the current step up to n
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        
        return second;
    }
}
