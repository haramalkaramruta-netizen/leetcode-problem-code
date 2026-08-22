class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            int j=0;
            while(j<nums2.length){
                if(nums1[i]==nums2[j]){
                    if(!result.contains(nums1[i])){
                        result.add(nums1[i]);
                    }
                    break;
                }
                j++;
            }
            
        }
        int[] arr = result.stream().mapToInt(Integer::intValue).toArray();
        return arr;  
    }
}