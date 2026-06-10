class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        int n =arr.length;
        ArrayList<Integer> ans  = new ArrayList<>();
        Stack<Integer> s  = new Stack<>();
        s.push(0);
        ans.add(1);
        for(int i=1;i<n;i++){
            while(s.isEmpty()==false && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            int span = s.isEmpty()?i+1:i-s.peek();
            ans.add(span);
            s.push(i);
        }
        return ans;
    }
}