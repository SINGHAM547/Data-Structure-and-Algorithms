class Solution {
    public int minDifference(int arr[]) {
        int n = arr.length;
        int sum=0;
        for(int x:arr){
            sum+=x;
        }
        boolean [][] dp = new boolean[n+1][sum+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=true;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(arr[i-1]<=j){
                    dp[i][j]  = dp[i-1][j] || dp[i-1][j-arr[i-1]];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int s1=0;s1<=sum/2;s1++){
            if(dp[n][s1]){
                int diff = sum-2*s1;
                ans = Math.min(ans,diff);
            }
        }
        return ans;
    }
}
