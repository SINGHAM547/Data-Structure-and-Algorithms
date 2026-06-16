class Solution {
    public ArrayList<Integer> linearProbing(int[] arr, int m) {
        int[] hash = new int[m];
        Arrays.fill(hash, -1);

        for (int x : arr) {
            int idx = x % m;
            int start = idx;
            boolean present = false;

            while (hash[idx] != -1) {
                if (hash[idx] == x) {
                    present = true;
                    break;
                }

                idx = (idx + 1) % m;

                if (idx == start) {
                    break;
                }
            }

            if (!present && hash[idx] == -1) {
                hash[idx] = x;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int x : hash) {
            ans.add(x);
        }

        return ans;
    }
}