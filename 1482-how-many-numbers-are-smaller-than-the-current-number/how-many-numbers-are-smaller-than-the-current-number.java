class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int currentnum = nums[i];
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<currentnum){
                    count++;
                }
            }
            list.add(count);
        }
        int result[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i] = list.get(i);
        }
        return result;
    }
}