class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums); 
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int b=i+1;
            int c=nums.length-1;
            while(b<c){
                int sum=nums[i]+nums[b]+nums[c];
                if(sum<0){
                    b++;
                }
                else if(sum>0){
                    c--;
                }
                else{
                    result.add(Arrays.asList(nums[i], nums[b], nums[c]));
                    // Skip duplicate values for the second element
                    while (b < c && nums[b] == nums[b + 1]) {
                        b++;
                    }
                    // Skip duplicate values for the third element
                    while (b < c && nums[c] == nums[c - 1]) {
                        c--;
                    }
                    
                    // Move both pointers inward for the next combination
                    b++;
                    c--; 
                }
            }
        }
        return result;    
    }           
}