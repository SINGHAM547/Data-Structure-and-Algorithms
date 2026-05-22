class Solution {

    public static String countSort(String s) {
        int[] count = new int[256];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < 256; i++) {
            while (count[i] > 0) {
                ans.append((char)i);
                count[i]--;
            }
        }
        return ans.toString();
    }
}