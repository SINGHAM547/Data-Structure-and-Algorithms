class Solution {
    public int longestUniqueSubstr(String s) {

        int res = 0;

        for(int i = 0; i < s.length(); i++) {

            HashSet<Character> set = new HashSet<>();
            int count = 0;

            for(int j = i; j < s.length(); j++) {

                if(set.contains(s.charAt(j))) {
                    break;
                }

                set.add(s.charAt(j));
                count++;
            }

            res = Math.max(res, count);
        }

        return res;
    }
}