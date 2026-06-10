class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> ans= new ArrayList<>();
        int n=arr.length;
        s.push(arr[n-1]);
        ans.add(-1);
        for(int i=n-2;i>=0;i--){
            while(s.isEmpty()==false && s.peek()<=arr[i]){
                s.pop();
            }
            int next= s.isEmpty()?-1:s.peek();
            ans.add(next);
            s.push(arr[i]);
        }
        Collections.reverse(ans);
        return ans;
    }
}