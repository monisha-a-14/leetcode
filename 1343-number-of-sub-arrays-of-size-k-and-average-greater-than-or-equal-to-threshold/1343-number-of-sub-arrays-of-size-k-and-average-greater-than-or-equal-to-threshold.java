class Solution {
    public int numOfSubarrays(int[] arr, int w, int threshold) {
        int n=arr.length;
        int cur_sum=0;
        int count=0;
        for(int i=0;i<w;i++){
            cur_sum=cur_sum+arr[i];
        }
        if(cur_sum>=w*threshold){
            count++;
        }
        for(int i=w;i<n;i++){
            cur_sum=cur_sum-arr[i-w]+arr[i];
            if(cur_sum>=w*threshold){
                 count++;
            }
        }
        return count;
    }
}