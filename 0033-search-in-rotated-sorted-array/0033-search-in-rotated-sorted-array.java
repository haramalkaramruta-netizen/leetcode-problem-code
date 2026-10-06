class Solution {
    public static int findPivoteIndex(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = n - 1;
        int ans = -1;

        if (nums[s] <= nums[e]) {
            // no effective rotation
            return -1;
        }

        // binary search wala logic
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] <= nums[n - 1]) {
                // iska matlab hum L2 vali line pr hai
                // ans to L1 wali line pr hai
                // iska matlab move to L1 ,or left
                e = mid - 1;
            } else {
                // mid mera L1 pr hiahi
                ans = mid;
                // move to right
                s = mid + 1;
            }
        }
        return ans;
    }

    static int binarySearchArray(int[] nums,int s, int e,int target) {
        
        int n = nums.length;
        while (s <= e) {

            // int mid = (low + high) / 2; overflow
            int mid = s + (e - s)/ 2;

            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int pivotIndex=findPivoteIndex(nums);
        int n=nums.length;
        //if pivote index is -1 then array is already sorted
    if(pivotIndex==-1){
        int ans =binarySearchArray(nums,0,n-1,target);
        return ans;
    }
    else{
        //array is not sorted ,array is rotated sorted
        //arry can be divided inti L1 ans L2 ligic
        int startArray1=0;
        int endArray1=pivotIndex;
        if(target>=nums[startArray1]&& target<=nums[endArray1]){
            int ans=binarySearchArray(nums,startArray1,endArray1,target);
            return ans;
        }
        int startArray2=pivotIndex+1;
        int endArray2=n-1;
        if(target>=nums[startArray2]&& target<=nums[endArray2]){
            int ans=binarySearchArray(nums,startArray2,endArray2,target);
            return ans;
        }

    }
    return -1;
    }
}