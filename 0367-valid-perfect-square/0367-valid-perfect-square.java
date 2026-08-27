class Solution {
    public boolean isPerfectSquare(int x) {
        int low=1,high=x;
        while(low<=high){
            int mid=low+(high-low)/2;
            if((long)mid*mid==x){
                return true;
            }
            else if((long)mid*mid<x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
         return false;
    }
}