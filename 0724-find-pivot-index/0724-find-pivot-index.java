class Solution {
    public int pivotIndex(int[] nums) {
        int rs=0;
        for(int i=0;i<nums.length;i++){
            rs=rs+nums[i];
        }
        int ls=0;
        for(int i=0;i<nums.length;i++){
            rs=rs-nums[i];
            if(rs==ls){
                return i;
            }else{
                ls=ls+nums[i];
            }
        }
        return -1;
    }
}