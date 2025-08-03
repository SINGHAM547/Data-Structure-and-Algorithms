class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> List = new ArrayList<>();
        for(int i=0;i<nums.length;i+=2){
            int freq =  nums[i];
            int val = nums[i+1];

            for(int j=0;j<freq;j++){
                List.add(val);
            }
        }
        int[] result = new int[List.size()];
        for(int i=0;i<List.size();i++){
            result[i] = List.get(i);
        }
        return result;
    }
}