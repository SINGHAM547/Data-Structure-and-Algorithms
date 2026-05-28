class Solution {
    boolean twoSum(int arr[], int target) {
        HashSet<Integer> ans = new HashSet<>();
        for(int i:arr){
            if(ans.contains(target-i)) return true;
            else ans.add(i);
        }
        return false;
    }
}