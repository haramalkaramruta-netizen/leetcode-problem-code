class Solution {
public:
    int mySqrt(int x) {
        int s=1;
        int e=x;
        int ans=-1;
        if(x==0){
            return 0;
        }
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid==x/mid){//also occuer integer overflow in that case in mid *mid(out of rande in integer)insted of writethat we write
                return mid;
            }
            else if(mid>x/mid){
                //move to left
                e=mid-1;

            }
            else{
                //move to right 
                //mid*mid<x
                //potential soln pr khade hai
                //ans store karo aur move to right,final ans k
                ans=mid;
                s=mid+1;
            }
        }
        return ans;
        
    }
};