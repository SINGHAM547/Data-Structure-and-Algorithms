class Solution {
    public int[] runningSum(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int currsum = 0;
        for(int num:nums){
            currsum += num;
            result.add(currsum);
        }
        int ans[] = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            ans[i] = result.get(i);
        }
        return ans;
    }
}