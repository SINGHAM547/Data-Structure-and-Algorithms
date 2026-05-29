class Solution {
    public int equalSumSpan(int[] a1, int[] a2) {

        int n = a1.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int res = 0;
        for (int i = 0; i < n; i++) {
            prefixSum += a1[i] - a2[i];

            if (prefixSum == 0) {
                res = i + 1;
            }
            if (map.containsKey(prefixSum)) {
                res = Math.max(res,i - map.get(prefixSum));
            }
            else {
                map.put(prefixSum, i);
            }
        }
        return res;
    }
}