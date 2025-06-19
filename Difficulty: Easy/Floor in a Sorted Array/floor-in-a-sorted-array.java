class Solution {
    static int findFloor(int[] arr, int x) {
        int l = 0;
        int h = arr.length - 1;
        int mid = 0;
        int ans = -1;
        while (l <= h) {
            mid = (l + h) / 2;
            if (arr[mid] == x) {
                ans = mid;
                l = mid + 1; // continue to find the last occurrence
            } else if (arr[mid] > x) {
                h = mid - 1;
            } else {
                ans = mid;
                l = mid + 1;
            }
        }
        return ans;
    }
}
