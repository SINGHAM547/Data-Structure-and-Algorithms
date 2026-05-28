class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        HashSet<Integer> h = new HashSet<Integer>();
        int presum = 0;
        for(int i=0;i<arr.length;i++){
            presum += arr[i];
            if(h.contains(presum)) return true;
            if(presum==0) return true;
            h.add(presum);
        }
        return false;
    }
}