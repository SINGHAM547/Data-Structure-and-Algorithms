class Solution {
    public ArrayList<String> generateBinary(int n) {
        ArrayList<String> ans = new ArrayList<>();
        Queue<String> q  =new LinkedList<String>();
        q.offer("1");
        for(int i=0;i<n;i++){
            String curr=q.poll();
            ans.add(curr);
            q.offer(curr+"0");
            q.offer(curr+"1");
        }
        return ans;
    }
}
