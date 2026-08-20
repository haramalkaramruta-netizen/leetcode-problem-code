class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int b=0;
        int c=numbers.length-1;
        while(b<c){
            int sum=numbers[b]+numbers[c];
            if(sum<target){
                b++;
            }
            else if(sum>target){
                c--;
            }
            else{
                return new int[]{b+1,c+1}; 
            }
        }        
        return new int[]{-1,-1};
    }
}