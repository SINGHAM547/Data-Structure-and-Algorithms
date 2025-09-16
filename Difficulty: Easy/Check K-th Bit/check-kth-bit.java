class CheckBit {
    static boolean checkKthBit(int n, int k) {
        int leftshifr = 1<<k;
        if((n&(leftshifr))==0) return false;
        else return true;
    }
}