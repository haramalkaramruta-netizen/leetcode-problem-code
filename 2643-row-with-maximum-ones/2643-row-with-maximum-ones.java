class Solution {
    static int getFirstOccIndex(int[][] arr,int rowIndex){
        int totalRow= arr.length;
        int totalCol=arr[0].length;
        int target=1;
        int ans=-1;

        //handling case where is no one unside the row
        if(arr[rowIndex][totalCol-1]==0){
            //it means there is no one inside this row
            return totalCol;
        }
        else{
            //1 exist inside the row
            int s=0;
            int e=totalCol-1;
            while(s<=e){
                int mid=s+(e-s)/2;
                if(arr[rowIndex][mid]==0){
                    //move to right
                    s=mid+1;

                }else{
                    //arr[eowIndex][mid]==1
                    ans=mid;
                    e=mid-1;
                
                }
            }
            return ans;
        }


    }
    public int[] rowAndMaximumOnes(int[][] mat) {
        int totalRow= mat.length;
        int totalCol= mat[0].length;
        int maxi=0;
        int maxOneWaliRowIndex=0;

        //move to each row for each row
        //find th e1st occurnt
        //using the First occ will calculate count of 1's-->totalRow-index of First occ 
        //update the max variable or the ans index varible baed on thatt

        for(int row=0; row<totalRow; row++){
            int oneCount=0;
            for (int col = 0; col < totalCol; col++) {
                if (mat[row][col] == 1) {
                    oneCount++;
                }
            }

            //for each row ,find 1st occ
            //int firstOccIndex = getFirstOccIndex(mat,row);
            //calculate no. of 1's in this row
            //int oneCount=totalCol-firstOccIndex;
            //update maxi ao ans index varialble basis on count
            if(oneCount > maxi){
                //ho sakta hai current row h ans hai
                maxi = oneCount;
                maxOneWaliRowIndex=row;
            }
        }
        return new int[]{maxOneWaliRowIndex, maxi};
    }
}