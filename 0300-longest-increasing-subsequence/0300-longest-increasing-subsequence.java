class Solution {
    public int findLISLength(List<Integer>original,List<Integer>sortedunique){
        int m=original.size(),n=sortedunique.size();
        int dp[][]=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(original.get(i-1).equals(sortedunique.get(j-1))){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    
    public int lengthOfLIS(int[] nums) {
        List<Integer>original=new ArrayList<>();
        for(int num:nums) original.add(num);
        Set<Integer>set=new TreeSet<>();
        for(int num:nums) set.add(num);
        List<Integer>sortedunique=new ArrayList<>(set);
        return findLISLength(original,sortedunique);
    }
}