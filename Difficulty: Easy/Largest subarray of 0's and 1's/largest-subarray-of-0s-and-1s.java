import java.util.*;

class Solution {
    public int maxLen(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {

            if (arr[i] == 0) {
                arr[i] = -1;
            }
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int maxLength = 0;
        for (int i = 0; i < n; i++) {

           prefixSum += arr[i];
            if (prefixSum == 0) {
                maxLength = i + 1;
            }
            if (map.containsKey(prefixSum)) {
                int length = i - map.get(prefixSum);
                maxLength = Math.max(maxLength, length);
            }
            else {
                map.put(prefixSum, i);
            }
        }
        return maxLength;
    }
}