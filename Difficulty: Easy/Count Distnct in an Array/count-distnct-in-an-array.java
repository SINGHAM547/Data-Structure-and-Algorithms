// User function Template for Java
class Solution {
    static int distinct(int arr[]) {
        HashSet<Integer> ans = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            ans.add(arr[i]);
        }
        return ans.size();
    }
}