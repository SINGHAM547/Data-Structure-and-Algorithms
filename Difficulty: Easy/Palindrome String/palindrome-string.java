class Solution {
    boolean isPalindrome(String s) {
        int begin=0;
        int end = s.length()-1;
        while(begin<end){
            if(s.charAt(begin)!=s.charAt(end)){
            return false;
        }
         begin++;
        end--;
    }
        return true;
    }
}