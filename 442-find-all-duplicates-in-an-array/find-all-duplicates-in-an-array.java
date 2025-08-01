class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> counts = new ArrayList<>();
        Arrays.sort(nums);
        for(int i =0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                 counts.add(nums[i]);
            }else{
                System.out.printf("");
            }   
        }
        return counts;
    }
}