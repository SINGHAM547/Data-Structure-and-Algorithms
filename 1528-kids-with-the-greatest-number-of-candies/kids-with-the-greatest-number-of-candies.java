class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int candycount:candies){
            if(candycount>max){
                max = candycount;
            }
        }
        List<Boolean> result = new ArrayList<>();
        for(int candycount: candies){
            result.add(candycount + extraCandies >= max);

        }
        return result;
    }
}