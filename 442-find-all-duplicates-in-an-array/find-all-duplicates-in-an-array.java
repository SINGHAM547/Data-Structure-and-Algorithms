class Solution {
    public List<Integer> findDuplicates(int[] nums) {
         int n = nums.length;
        // 1. & 2. Create a frequency list of size n, initialized to zeros
        List<Integer> counts = new ArrayList<>(Collections.nCopies(n + 1, 0));
        
        // 3. Count occurrences of each number
        for (int num : nums) {
            counts.set(num, counts.get(num) + 1);
        }
        
        // 4. Collect all numbers that appeared twice
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (counts.get(i) == 2) {
                result.add(i);
            }
        }
        
        // 5. Return the list of duplicates
        return result;
    }
}