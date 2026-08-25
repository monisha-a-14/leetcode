class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n=arr.length;
        int cur_sum=0;
        int count=0;
        for(int i=0;i<k;i++){
            cur_sum=cur_sum+arr[i];
        }
        if(cur_sum>=k*threshold){
            count++;
        }
        for(int i=k;i<n;i++){
            cur_sum=cur_sum-arr[i-k]+arr[i];
            if(cur_sum>=k*threshold){
                 count++;
            }
        }
        return count;
    }
}