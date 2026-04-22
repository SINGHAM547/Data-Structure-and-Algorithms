class Solution {
    public int reverse(int x) {
        int reversed = 0;
        while(x!=0){
            int lastd = x%10;
            x = x/10;
            if(reversed>0 && reversed>(Integer.MAX_VALUE-lastd)/10 || reversed<0 && reversed<(Integer.MIN_VALUE-lastd)/10) return 0;
            reversed = reversed*10+lastd;
        }
        return reversed;
    }
}