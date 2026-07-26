class Solution {
    public int totalWays(int[] arr, int target) {
        int n = arr.length;
        int sum=0;
        for(int x:arr){
            sum+=x;
        }
        if(Math.abs(target)>sum) return 0;
        if((sum+target)%2!=0)return 0;
        int req = (sum+target)/2;
        int dp[][] = new int[n+1][req+1];
        dp[0][0]=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=req;j++){
                dp[i][j] = dp[i-1][j];
                if(arr[i-1]<=j){
                    dp[i][j] += dp[i-1][j-arr[i-1]];
                }
            }
        }
        return dp[n][req];
    }
}