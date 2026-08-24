class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n=arr.length;
        int left[]=new int[n];
        left[0]=1;
        for(int i=1;i<n;i++){
            left[i]=left[i-1]*arr[i-1];
        }
        int right=1;
        for(int i=n-1;i>=0;i--){
            left[i]=left[i]*right;
            right=right*arr[i];
        }
        return left;
    }
}