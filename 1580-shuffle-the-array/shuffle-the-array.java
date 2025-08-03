class Solution {
    public int[] shuffle(int[] nums, int n) {
        List<Integer> list = new ArrayList<>();
        for( int i=0;i<n;i++){
            list.add(nums[i]);
            list.add(nums[i+n]);
        }
        int result[] = new int[2*n];
        for(int i=0;i<list.size();i++){
            result[i]  = list.get(i);
        }
        return result;
    }
}