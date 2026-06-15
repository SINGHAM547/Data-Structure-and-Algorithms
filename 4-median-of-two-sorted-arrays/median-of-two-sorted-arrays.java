class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int x : nums1) {
            a.add(x);
        }
        for (int x : nums2) {
            a.add(x);
        }
        Collections.sort(a);
        int n = a.size();
        if (n % 2 == 1) {
            return a.get(n / 2);
        }
        return (a.get(n / 2) + a.get(n / 2 - 1)) / 2.0;
    }
}