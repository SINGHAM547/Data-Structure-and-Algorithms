class Solution {
    public int longestSubarray(int[] arr, int k) {
        HashMap<Integer,Integer>m = new HashMap<>();
        int presum=0,res=0;
        for(int i=0;i<arr.length;i++){
            presum += arr[i];
            if(presum==k) res=i+1;
            if(m.containsKey(presum)==false) m.put(presum,i);
            if(m.containsKey(presum-k)) res = Math.max(res,i-m.get(presum-k));
        }
        return res;
    }
}
