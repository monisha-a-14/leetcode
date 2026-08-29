class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int doi[]=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                int pindex=st.pop();
                doi[pindex]=i-pindex;
            }
            st.push(i);
        }
        return doi;
    }
}