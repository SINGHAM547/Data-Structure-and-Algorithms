class Solution {
    public ArrayList<Integer> quadraticProbing(int[] arr, int m) {
        int[] hash = new int[m];
        Arrays.fill(hash, -1);

        for (int x : arr) {
            int h = x % m;

            if (hash[h] == -1) {
                hash[h] = x;
            } else if (hash[h] != x) {

                int i = 1;

                while (i < m) {
                    int idx = (h + i * i) % m;

                    if (hash[idx] == x) {
                        break;
                    }

                    if (hash[idx] == -1) {
                        hash[idx] = x;
                        break;
                    }

                    i++;
                }
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int x : hash) {
            ans.add(x);
        }

        return ans;
    }
}