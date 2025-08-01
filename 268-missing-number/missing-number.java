class Solution {
    public int missingNumber(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int num:nums){
            list.add(num);
        }

        Collections.sort(list);

        for(int i=0;i<list.size();i++){
            if(list.get(i) != i){
                return i;
            }
        }
        return nums.length;
    }
}