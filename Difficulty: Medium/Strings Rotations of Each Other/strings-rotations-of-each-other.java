class Solution {

    public boolean areRotations(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        String txt = s1 + s1;

        return rabinKarp(txt, s2);
    }

    boolean rabinKarp(String txt, String pat) {

        int n = txt.length();
        int m = pat.length();

        int d = 256;
        int q = 101;

        int h = 1;

        for (int i = 0; i < m - 1; i++) {
            h = (h * d) % q;
        }

        int pHash = 0;
        int tHash = 0;

        for (int i = 0; i < m; i++) {
            pHash = (d * pHash + pat.charAt(i)) % q;
            tHash = (d * tHash + txt.charAt(i)) % q;
        }

        for (int i = 0; i <= n - m; i++) {

            if (pHash == tHash) {

                boolean match = true;

                for (int j = 0; j < m; j++) {

                    if (txt.charAt(i + j) != pat.charAt(j)) {
                        match = false;
                        break;
                    }
                }

                if (match)
                    return true;
            }

            if (i < n - m) {

                tHash = (d * (tHash - txt.charAt(i) * h)
                        + txt.charAt(i + m)) % q;

                if (tHash < 0)
                    tHash += q;
            }
        }

        return false;
    }
}