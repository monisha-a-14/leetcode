class Solution {
    public double findMaxAverage(int[] arr, int w) {
        int n=arr.length;
        int cur_sum=0;
        for(int i=0;i<w;i++){
            cur_sum=cur_sum+arr[i];
        }
        int max_sum=cur_sum;
        for(int i=w;i<n;i++){
            cur_sum=cur_sum-arr[i-w]+arr[i];
            if(cur_sum>max_sum){
                max_sum=cur_sum;
            }
        }
        return (double)max_sum/w;
    }
}