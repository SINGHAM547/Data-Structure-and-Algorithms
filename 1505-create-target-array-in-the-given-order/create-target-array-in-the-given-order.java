class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> targetList = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            targetList.add(index[i], nums[i]);
        }
        int result[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i] = targetList.get(i);
        }
        return result;
    }
}