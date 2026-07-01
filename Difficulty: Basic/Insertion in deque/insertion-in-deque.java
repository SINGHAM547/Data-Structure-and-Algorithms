class Solution {
    public Deque<Integer> dqInsertion(List<Integer> arr) {
        Deque<Integer> d = new LinkedList<Integer>();
        for(int i:arr){
            d.offer(i);
        }
        return d;
    }
}