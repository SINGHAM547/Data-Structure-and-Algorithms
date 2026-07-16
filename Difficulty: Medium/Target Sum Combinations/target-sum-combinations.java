class Solution {
    public ArrayList<ArrayList<Integer>> targetSumComb(int[] arr, int target) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        backtrack(0,target,arr,new ArrayList<>(),ans);
        return ans;
    }
    void backtrack(int idx,int target,int[] arr,ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
            curr.add(arr[i]);
            backtrack(i,target-arr[i],arr,curr,ans);
            curr.remove(curr.size()-1);
        }
    }
}