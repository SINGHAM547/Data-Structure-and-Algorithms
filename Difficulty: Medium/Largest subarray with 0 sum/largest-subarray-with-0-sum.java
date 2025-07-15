class Solution {
    int maxLength(int arr[]) {
       Map<Integer, Integer> prefixSumIndex = new HashMap<>();
        
        int sum = 0;     // Cumulative sum of elements
        int maxLength = 0;

        // To handle subarrays starting from index 0, we initialize with sum 0 at index -1
        prefixSumIndex.put(0, -1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // If this prefix sum was seen before, we found a subarray with sum = 0
            if (prefixSumIndex.containsKey(sum)) {
                int length = i - prefixSumIndex.get(sum);
                maxLength = Math.max(maxLength, length);
            } else {
                // Store first occurrence of this prefix sum
                prefixSumIndex.put(sum, i);
            }
        }

        return maxLength;
    }
}