class Solution {
    public int maximumWealth(int[][] accounts) {
        ArrayList<Integer> max = new ArrayList<>();
        for(int i=0;i<accounts.length;i++){
            int currentWealth = 0;

            for(int j=0;j<accounts[i].length;j++){
                currentWealth += accounts[i][j];
            }
            max.add(currentWealth);
        }
        if(max.isEmpty()){
            return 0;
        }
        return Collections.max(max);
    }
}