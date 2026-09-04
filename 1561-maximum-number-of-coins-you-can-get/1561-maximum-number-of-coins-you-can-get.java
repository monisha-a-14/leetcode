class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int left=0;
        int right=piles.length-2;
        int ans=0;
        while(left<right){
            ans=ans+piles[right];
            right=right-2;
            left++;
        }
        return ans;
    }
}