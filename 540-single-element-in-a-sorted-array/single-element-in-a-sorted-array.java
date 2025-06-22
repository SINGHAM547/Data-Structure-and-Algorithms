class Solution {
    public int singleNonDuplicate(int[] nums) {
        int num = nums[0];
        int n = nums.length;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                i++;
            }else if(nums[i]!= nums[i+1]) {
                num = nums[i];
                return num;
            }
           
        }
         return nums[n-1];
        
    }
}