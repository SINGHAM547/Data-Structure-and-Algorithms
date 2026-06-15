class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n =nums.length;
     int maxnormal=normalsum(nums,n);
     if(maxnormal<0){
        return maxnormal;
     }
     int arrsum=0;
     for(int i=0;i<n;i++){
        arrsum += nums[i];
        nums[i] =-nums[i];
     }
     int maxcircular = arrsum+normalsum(nums,n);
     return Math.max(maxnormal,maxcircular);
    }
    int normalsum(int nums[],int n){
            n=nums.length;
        int res=nums[0],maxending=nums[0];
        for(int i=1;i<n;i++){
            maxending = Math.max(nums[i],maxending+nums[i]);
            res=Math.max(res,maxending);
        }
        return res;
    }
}