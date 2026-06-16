class Solution {
    public ArrayList<ArrayList<Integer>> separateChaining(int hashSize, int[] arr) {
           ArrayList<ArrayList<Integer>> hash = new ArrayList<>();
           for(int i=0;i<hashSize;i++){
               hash.add(new ArrayList<>());
           }
           for(int x:arr){
               int idx = x%hashSize;
               hash.get(idx).add(x);
           }
          return hash;
    }
}