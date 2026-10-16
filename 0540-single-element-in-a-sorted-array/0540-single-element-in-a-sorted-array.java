class Solution {
    public int singleNonDuplicate(int[] nums) {
      int n=nums.length;
      int s=0;
      int e=n-1;
      while(s<=e){
        int mid=s+(e-s)/2;
        //single element
        if(s==e){
            return nums[s];
        }
        //multiple item
        //check mid element is ans or not
        int currentValue=nums[mid];
        int prevValue=-1;
        if(mid-1>=0){
            prevValue=nums[mid-1];
        }
        int nextValue=-1;
        if(mid+1<n){
            nextValue=nums[mid+1];
        }
        if(currentValue != prevValue && currentValue!= nextValue){
            //iska matlb current vaklue hi ans hai

            return currentValue;
        }
        if(currentValue != prevValue && currentValue== nextValue){
            int startingIndexOfPair=mid;
            if((startingIndexOfPair & 1)==1){
                //startingIndexOfPair id odd
                //ans left me hoga
                e=mid-1;

            }
            else{
                //startingIndexOfPair even
                //ans in right
                s=mid+1;
            }
        }
        else if(currentValue == prevValue && currentValue!= nextValue){
            int endingIndexOfPair=mid;
            if((endingIndexOfPair & 1)==1){
                //endingIndexOfPair id odd
                //ans right me hoga
                s=mid+1;
            }
            else{
                //endingIndexOfPair even
                //ans in left
                e=mid-1;

            }


        }
      } 
      return -1;
    }
}