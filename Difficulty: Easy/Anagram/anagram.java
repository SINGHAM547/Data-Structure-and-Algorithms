class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;
        char a1[] = s1.toCharArray();
        Arrays.sort(a1);
        s1 = new String(a1);
        
        char b1[] = s2.toCharArray();
        Arrays.sort(b1);
        s2 = new String(b1);
        
        return s1.equals(s2);
    }
}