class Solution{
    public int singleNumber(int[] arr) {
        int n=arr.length;
        int res=0;
        for(int i=0;i<n;i++){
            res=res^arr[i];
        }
        return res;
    }
}