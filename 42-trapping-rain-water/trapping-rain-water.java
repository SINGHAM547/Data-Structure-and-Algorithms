class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int total =0;
        int l=0 , r = n-1;
        int lmax=height[l];
        int rmax =height[r];
        while(l<=r){
            if(lmax>=rmax){
                total += (rmax-height[r]);
                r--;
                if(r>=0) rmax = Math.max(rmax,height[r]);
            }
            else{
                total += (lmax-height[l]);
                l++;
                if(l<n) lmax = Math.max(lmax,height[l]);

            }
        } 
        return total;
        }
}