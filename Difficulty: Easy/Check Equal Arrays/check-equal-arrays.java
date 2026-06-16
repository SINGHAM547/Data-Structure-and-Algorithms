class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        if(a.length!=b.length) return false;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int x:a){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int x:b){
            if(!map.containsKey(x)) return false;
            map.put(x,map.get(x)-1);
            if(map.get(x)==0){
            map.remove(x);
            }
        }
        return map.isEmpty();
    }
}