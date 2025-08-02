class Solution {
    public int[] buildArray(int[] nums) {
        List<Integer> anslist = new ArrayList<>();
        int n = nums.length;

        for(int i=0;i<n;i++){
            int newvalue = nums[nums[i]];
            anslist.add(newvalue);
        }

        int result[] = new int[n];
        for(int i=0;i<n;i++){
            result[i] = anslist.get(i);
        }
        return result;
    }
}