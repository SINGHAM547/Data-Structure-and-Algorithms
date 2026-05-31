class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) return 0;
        
        int n = height.length;
        int total = 0;
        int l = 0, r = n - 1;
        int lmax = 0, rmax = 0;
        
        while (l <= r) {
            lmax = Math.max(lmax, height[l]);
            rmax = Math.max(rmax, height[r]);
            
            // The smaller wall always determines the water level
            if (lmax < rmax) {
                total += (lmax - height[l]);
                l++;
            } else {
                total += (rmax - height[r]);
                r--;
            }
        } 
        return total;
    }
}