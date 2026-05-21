class Solution {
    public int kthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        int i=0;
        while(i!=k){
            i++;
        }
        return arr[i-1];
    }
}
