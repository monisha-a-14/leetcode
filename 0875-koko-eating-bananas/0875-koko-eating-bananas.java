class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>high){
                high=piles[i];
            }
        } 
        while(low<high){
            int mid=(low+high)/2;
            int hours=0;
            for(int i=0;i<piles.length;i++){
                hours=hours+(piles[i]+mid-1)/mid;
            }
            if(hours>h)
               low=mid+1;
            else
               high=mid;
        }
        return low;
    }
}