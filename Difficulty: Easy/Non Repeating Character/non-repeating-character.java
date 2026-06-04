class Solution {
    public char nonRepeatingChar(String s) {
        char ans = '$';
        HashMap <Character,Integer> h = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int freq = h.getOrDefault(c,0);
            h.put(c,(freq+1));
        }
        for(int i=0;i<s.length();i++){
            if(h.get(s.charAt(i))==1){
                ans = s.charAt(i);
                break;
            }
        }
        return ans;
    }
}
