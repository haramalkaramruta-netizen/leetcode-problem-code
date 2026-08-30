class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if (n <= 1) {
            return n;
        }

        // Find the indices of the minimum and maximum elements
        int minIdx = 0;
        int maxIdx = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[minIdx]) {
                minIdx = i;
            }
            if (nums[i] > nums[maxIdx]) {
                maxIdx = i;
            }
        }

        // Ensure i is always the smaller index to simplify math
        int i = Math.min(minIdx, maxIdx);
        int j = Math.max(minIdx, maxIdx);

        // Option 1: Delete both from the front
        int opt1 = j + 1;
        
        // Option 2: Delete both from the back
        int opt2 = n - i;
        
        // Option 3: Delete i from front, j from back
        int opt3 = (i + 1) + (n - j);

        // Return the minimum of all three options
        return Math.min(opt1, Math.min(opt2, opt3));
    }
}
