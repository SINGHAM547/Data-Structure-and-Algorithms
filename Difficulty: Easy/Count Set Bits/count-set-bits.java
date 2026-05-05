// User function Template for Java
class Solution {
    static int setBits(int n) {
        int res=0;
        while(n>0){
            n=n&(n-1);
            res++;
        }
        return res;
    }
}