public class Solution {
    public int reverseBits(int n) {
        int reversedNum = 0;
        for (int i = 0; i < 32; i++) {
            int lsb = (n >> i) & 1;
            reversedNum |= (lsb << (31 - i));
        }
        return reversedNum;
    }
}