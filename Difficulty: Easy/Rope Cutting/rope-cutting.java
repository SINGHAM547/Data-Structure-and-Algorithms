class Solution {
    public ArrayList<Integer> RopeCutting(int arr[]) {
        Arrays.sort(arr);

        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                ans.add(n - i);
            }
        }

        return ans;
    }
}