class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (map.containsKey(num)) {
                int oldCount = map.get(num);
                map.put(num, oldCount + 1);

            } else {
            map.put(num, 1);
            }
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int key : map.keySet()) {

            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(key);
            temp.add(map.get(key));
            ans.add(temp);
        }
        return ans;
    }
}