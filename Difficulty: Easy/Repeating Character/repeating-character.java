class Solution {
    static final int CHAR = 256;
    public int repeatedCharacter(String S) {
        
        int []count = new int[CHAR];
        for(int i=0;i<S.length();i++){
            count[S.charAt(i)]++;
        }
        for(int i=0;i<S.length();i++){
            if(count[S.charAt(i)]>1){
                return i;
            }
        }
        return -1;
    }
}