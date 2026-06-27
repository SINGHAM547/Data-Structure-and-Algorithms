class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        Arrays.sort(arr);
        ArrayList<Integer> ans = new ArrayList<>();
            for(int i=arr.length-1;i>=0;i--){
                ans.add(arr[i]);
                k=k-1;
                if(k==0){
                break;
                }
        }
        return ans;
    }
}
