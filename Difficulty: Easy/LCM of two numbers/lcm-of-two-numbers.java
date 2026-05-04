class Solution {
    int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public int lcm(int a, int b) {
        return (a*b)/gcd(a,b);
    }
}

//a*b = gcd(a,b)*lcm(a,b)  Formula /relation b tw gcd and lcm//