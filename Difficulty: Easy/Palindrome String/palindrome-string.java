class Solution {

    boolean isPalindrome(String s) {
        return check(s, 0, s.length() - 1);
    }

    boolean check(String s, int left, int right) {
        if (left >= right) return true;

        if (s.charAt(left) != s.charAt(right)) return false;

        return check(s, left + 1, right - 1);
    }
}