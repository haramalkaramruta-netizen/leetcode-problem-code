class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;
        
        // Calculate the total sum of the array
        for (int num : nums) {
            totalSum += num;
        }
        
        // Iterate through the array to find the pivot index
        for (int i = 0; i < nums.length; i++) {
            // Right sum is total sum minus left sum minus the current element
            int rightSum = totalSum - leftSum - nums[i];
            
            // Check if the equilibrium condition is met
            if (leftSum == rightSum) {
                return i;
            }
            
            // Update the left sum for the next iteration
            leftSum += nums[i];
        }
        
        // Return -1 if no pivot index is found
        return -1;
    }
}
