class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
             map.put(i, map.getOrDefault(i, 0)+1);
        }
        map.forEach((key, value)->{
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(key);
            temp.add(value);
            res.add(temp);
        });
        return res;
    }
}