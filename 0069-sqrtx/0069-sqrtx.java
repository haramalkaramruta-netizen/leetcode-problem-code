class Solution {
    public int mySqrt(int x) {
        //return Math(int).sqrt(x);or 
        int s=1;
        int e=x;
        int ans=-1;
        if(x==0){
            return 0;
        }

        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid==x/mid){
                //integerr over flow ho raha h when we do mid*mid ye int ki range se hi baher ja raha hai so how we can handle it
                return mid;
            }
            else if(mid>x/mid){
                //move to left 
                e=mid-1;

            }
            else{
                //mid*mid<x
                //potential soln pr ho
                //store the ans and move to right
                ans=mid;
                s=mid+1;
            }

        }
        return ans;


    }
}