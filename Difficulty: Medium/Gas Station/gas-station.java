class Solution {
    public int startStation(int[] gas, int[] cost) {
        int st=0,curr=0;
        int prev=0;
        for(int i=0;i<gas.length;i++){
            curr+= (gas[i]-cost[i]);
            if(curr<0){
                st=i+1;
                prev+= curr;
                curr=0;
            }
        }
        return ((curr+prev)>=0)?st:-1;
    }
}