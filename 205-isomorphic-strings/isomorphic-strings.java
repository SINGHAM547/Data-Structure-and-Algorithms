class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map <Character,Character> charmap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if(!charmap.containsKey(original)){
                if(!charmap.containsValue(replacement))
                charmap.put(original,replacement);
                else
                return false;
            }else{
                char mappedCharacter = charmap.get(original);
                if(mappedCharacter != replacement)
                return false;
            }
        }
        return true;
    }
}