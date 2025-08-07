class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <=1){
            return intervals;
        }

        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0], b[0]));

        List<int[]> mergedIntervals = new ArrayList<>();
        mergedIntervals.add(intervals[0]);

        for(int i=1;i<intervals.length;i++){
            int[] currentInterval = intervals[i];
            int[] lastMergedInterval = mergedIntervals.get(mergedIntervals.size()-1);

            if(currentInterval[0] <= lastMergedInterval[1]){
                lastMergedInterval[1] = Math.max(lastMergedInterval[1], currentInterval[1]);

            }else{
                mergedIntervals.add(currentInterval);
            }
        }
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}