class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        int[] stack = new int[n];
        int top = -1;

        int second = Integer.MIN_VALUE;

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {

            // Found nums[i] < nums[k] < nums[j]
            if (nums[i] < second) {
                return true;
            }

            // Find a possible middle element
            while (top >= 0 && nums[i] > stack[top]) {
                second = stack[top];
                top--;
            }

            // Push current element
            stack[++top] = nums[i];
        }

        return false;
    }
}
