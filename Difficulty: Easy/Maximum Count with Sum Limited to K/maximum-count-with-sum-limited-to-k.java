class Solution {
    static int toyCount(int arr[], int k) {
        Arrays.sort(arr);
        int count=0;
    
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=k){
                k=k-arr[i];
                count++;
            }
        }
        return count;
    }
}