class Solution {
    public int countEven(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            int a=i;
            int sum=0;
            while(a>0){
            sum=sum+a%10;
            a=a/10;
        }
        if(sum%2==0){
            count++;
        }

        }

        return count;
        
        }
        
    }
