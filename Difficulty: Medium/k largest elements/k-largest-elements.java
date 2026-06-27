class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            if(arr[i]>pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        while(!pq.isEmpty()){
            ans.add(pq.poll());
        }
        Collections.reverse(ans);
        return ans;
    }
}
