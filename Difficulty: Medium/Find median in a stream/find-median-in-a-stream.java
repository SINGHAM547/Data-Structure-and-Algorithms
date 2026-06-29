class Solution {
    public ArrayList<Double> getMedian(int[] arr) {
        PriorityQueue<Integer> g= new PriorityQueue<>();
        PriorityQueue<Integer> s  = new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Double> ans  = new ArrayList<>();
        
        s.add(arr[0]);
        ans.add((double)arr[0]);
        for(int i=1;i<arr.length;i++){
            int x = arr[i];
            if(s.size()>g.size()){
                if(s.peek()>x){
                    g.add(s.poll());
                    s.add(x);
                }else{
                    g.add(x);
                }
                ans.add((s.peek()+g.peek())/2.0);
            }else{
                if(x<=s.peek()){
                    s.add(x);
                }else{
                    g.add(x);
                    s.add(g.poll());
                }
                ans.add((double) s.peek());
            }
        }
        return ans;
    }
}