class Solution {
    public int mySqrt(int x) {
        int low=0,high=x, ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid*mid==x)
                return mid;
            else if((long)mid*mid<x){
                ans=mid;
                low=mid+1;
            }
            else
                high=mid-1;
        }
         return ans;
    }
}