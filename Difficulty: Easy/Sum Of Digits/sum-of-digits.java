class Solution {
    static int sumOfDigits(int n) {
        int sum=0;
        while(n>0){
            int lastd = n%10;
            sum += lastd;
            n=n/10;
        }
        return sum;
    }
}
