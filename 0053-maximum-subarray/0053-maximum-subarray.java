class Solution {
    public int maxSubArray(int[] nums) {
        // MIN_VALUE for maxinum value find in java
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            // step 1:sum create krte hai
            sum = sum + nums[i];
            // step 2:max update krte hai
            maxi = Math.max(maxi, sum);
            // step3:check sum is less than 0
            if (sum < 0) {
                sum = 0;
            }
        }
        // return mAX value
        return maxi;
    }
}