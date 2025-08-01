class Solution {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length==0){
            return;
        }

        List<Integer> zeroes = new ArrayList<>();
        List<Integer> ones = new ArrayList<>();
        List<Integer> twos = new ArrayList<>();

        for(int num : nums){
            if(num==0){
                zeroes.add(num);
            }else if(num==1){
                ones.add(num);
            }else{
                twos.add(num);
            }
        }
        int index=0;
        for(int num:zeroes){
            nums[index++] = num;
        }
        for(int num:ones){
            nums[index++] = num;
        }
        for(int num : twos){
            nums[index++] = num;
        }
    }
}