class Solution {
    public int[] getConcatenation(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int num : nums){
            ans.add(num);
        }
        for(int num: nums){
            ans.add(num);
        }
        int []answer = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            answer[i] = ans.get(i);
        }
        return answer;
    }
}