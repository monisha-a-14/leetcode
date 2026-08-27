class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0,right=0;
        for(int w:weights){
            left=Math.max(left,w);
            right=right+w;
        }
        while(left<right){
            int mid=(left+right)/2;
            int requiredDays=1;
            int currentload=0;
            for(int w:weights){
                if(currentload+w>mid){
                    requiredDays++;
                    currentload=0;
                }
                currentload=currentload+w;
            }
            if(requiredDays>days){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return left;
    }
}