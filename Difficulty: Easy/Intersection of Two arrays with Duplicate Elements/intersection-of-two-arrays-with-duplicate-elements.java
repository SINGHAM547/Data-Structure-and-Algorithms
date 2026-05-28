class Solution {
    public ArrayList<Integer> intersect(int[] a, int[] b) {
        HashSet<Integer> s = new HashSet<Integer>();
        for(int i=0;i<b.length;i++){
            s.add(b[i]);
        }
        ArrayList<Integer> ans  = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(s.contains(a[i])){
                ans.add(a[i]);
                s.remove(a[i]);
            }
        }
        return ans;
    }
}