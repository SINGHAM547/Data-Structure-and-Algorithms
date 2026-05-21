class Solution {
    public int findMinDiff(int arr[], int m) {
        Arrays.sort(arr);
        if(m>arr.length){
            return -1;
        }
        int res = arr[m-1]-arr[0];
        for(int i=0;(i+m-1)<arr.length;i++){
        res = Math.min(res,arr[i+m-1]-arr[i]);
        }
        return res;
    }
}