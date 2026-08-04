class Solution {
    public int missingNumber(int[] nums) {
        int xorSum = 0;
        // xor with all the array element
        for (int n : nums) {
            xorSum = xorSum ^ n;
        }
        // xor with all the element in the array
        int n = nums.length;
        for (int i = 0; i <= n; i++) {
            xorSum = xorSum ^ i;
        }
        // ans ayega
        return xorSum;
    }
}