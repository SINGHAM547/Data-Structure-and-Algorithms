class Solution {
    public int maxConsecBits(int[] arr) {

        int n = arr.length;

        int curr = 1;
        int ans = 1;

        for(int i = 1; i < n; i++) {

            if(arr[i] == arr[i - 1]) {
                curr++;
            }
            else {
                curr = 1;
            }

            ans = Math.max(ans, curr);
        }

        return ans;
    }
}