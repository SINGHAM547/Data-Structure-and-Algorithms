// User function Template for Java

class Solution {
    public int findKRotation(List<Integer> arr) {
        int low = 0, high = arr.size() - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr.get(mid) > arr.get(high)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low; 
    }
}
