class Solution {

    class Job {
        int deadline, profit;

        Job(int d, int p) {
            deadline = d;
            profit = p;
        }
    }

    int[] parent;

    int find(int x) {
        if (parent[x] == x)
            return x;
        return parent[x] = find(parent[x]);
    }

    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {

        int n = deadline.length;

        Job[] arr = new Job[n];
        int maxDeadline = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = new Job(deadline[i], profit[i]);
            maxDeadline = Math.max(maxDeadline, deadline[i]);
        }

        Arrays.sort(arr, (a, b) -> b.profit - a.profit);

        parent = new int[maxDeadline + 1];

        for (int i = 0; i <= maxDeadline; i++)
            parent[i] = i;

        int jobs = 0;
        int totalProfit = 0;

        for (Job j : arr) {

            int slot = find(j.deadline);

            if (slot > 0) {
                jobs++;
                totalProfit += j.profit;

                parent[slot] = find(slot - 1);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(jobs);
        ans.add(totalProfit);

        return ans;
    }
}