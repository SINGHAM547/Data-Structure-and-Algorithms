class Solution {
    class Pair{
        int diff;
        int value;
        Pair(int diff,int value){
            this.diff=diff;
            this.value=value;
        }
    }
    int[] printKClosest(int[] arr, int k, int x) {
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->b.diff-a.diff);
        for(int num:arr){
            if(num==x){
                continue;
            }
            int diff=Math.abs(num-x);
            if(pq.size()<k){
                pq.add(new Pair(diff,num));
            }else{
                Pair top=pq.peek();
                if(top.diff>diff || (top.diff==diff && top.value<num)){
                    pq.poll();
                    pq.add(new Pair(diff,num));
                }
            }
        }
       ArrayList<Pair> list = new ArrayList<>();

        while (!pq.isEmpty()) {
            list.add(pq.poll());
        }
        
        Collections.sort(list, (a, b) -> {
            if (a.diff == b.diff)
                return b.value - a.value;  
            return a.diff - b.diff;
        });
        
        int[] ans = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i).value;
        }
        
        return ans;
    }
}
