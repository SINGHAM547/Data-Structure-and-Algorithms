class Solution {
    public ArrayList<Integer> getDivisors(int n) {
        ArrayList<Integer> small = new ArrayList<>();
        ArrayList<Integer> large = new ArrayList<>();

        for(int i = 1; i * i <= n; i++){
            if(n % i == 0){
                small.add(i);
                if(i != n / i){
                    large.add(n / i);
                }
            }
        }
        for(int i = large.size() - 1; i >= 0; i--){
            small.add(large.get(i));
        }
        return small;
    }
}