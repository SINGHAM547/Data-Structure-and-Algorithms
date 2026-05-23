class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] charArray1 = s.toCharArray();
        char[] charArray2 = t.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        String sorted1 = new String(charArray1);
        String sorted2 = new String(charArray2);

        return sorted1.equals(sorted2);
    }
}