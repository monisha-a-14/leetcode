class Solution {
    public int maxSubarraySumCircular(int[] arr) {
        int total=0;
        int curmax=0,maxsum=arr[0];
        int curmin=0,minsum=arr[0];
        for(int i=0;i<arr.length;i++){
            curmax=Math.max(arr[i],arr[i]+curmax);
            maxsum=Math.max(curmax,maxsum);
            curmin=Math.min(arr[i],arr[i]+curmin);
            minsum=Math.min(curmin,minsum);
            total=total+arr[i];
        }
        if(maxsum<0)
        return maxsum;
        return Math.max(maxsum,total-minsum);
    }
}