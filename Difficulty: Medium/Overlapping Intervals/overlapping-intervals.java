class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {

        ArrayList<int[]> res = new ArrayList<>();
        if (arr.length <= 1) {
            res.add(arr[0]);
            return res;
        }
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int[] newInterval = arr[0];
        res.add(newInterval);

        for (int i = 1; i < arr.length; i++) {
            int[] interval = arr[i];
            if (interval[0] <= newInterval[1]) {
                newInterval[1] =
                    Math.max(newInterval[1], interval[1]);
            } else {
                newInterval = interval;
                res.add(newInterval);
            }
        }
        return res;
    }
}