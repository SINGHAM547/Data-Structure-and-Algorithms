class Solution {
    public int maxProduct(int[] nums) {
        int n =nums.length;
        int lp = 1;
        int rp=1;
        int ans=nums[0];
        for(int i=0;i<n;i++){
            if(lp==0) lp = 1;
            if(rp==0) rp=1;
            lp *= nums[i];
            rp *= nums[n-1-i];
            ans = Math.max(ans,Math.max(lp,rp));
        }
        return ans;
    }
}