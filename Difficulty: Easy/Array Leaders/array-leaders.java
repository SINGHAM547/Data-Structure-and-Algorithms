class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
           int n = arr.length;
            ArrayList<Integer> ans = new ArrayList<>();
            int rmax = Integer.MIN_VALUE;
            for(int i=n -1; i>=0;i--){
                if(arr[i]>=rmax){
                    ans.add(arr[i]);
                    rmax = arr[i];
                }
            }
            Collections.reverse(ans);
            return ans;
    }
}
