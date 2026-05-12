class Solution {
    int maxSubarraySum(int[] arr) {
        int res = arr[0];
        int maxend = arr[0];
        for(int i = 1;i<arr.length;i++){
            maxend = Math.max(maxend +arr[i] ,arr[i]);
            res = Math.max(res,maxend);
        }
        return res;
    }
}
