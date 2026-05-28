class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        HashSet<Integer> ans= new HashSet<>();
        for(int i=0;i<a.length;i++){
            ans.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            ans.add(b[i]);
        }
        ArrayList<Integer> res= new ArrayList<>();
        for(int i:ans){
            res.add(i);
        }
        return res;
    }
}