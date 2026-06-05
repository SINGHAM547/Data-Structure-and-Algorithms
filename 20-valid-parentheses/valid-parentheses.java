class Solution {
    public boolean isValid(String s) {
        Deque <Character> str = new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char x=  s.charAt(i);
            if(x=='('|| x=='{'|| x=='['){
                str.push(x);
            }else{
                if(str.isEmpty()==true) return false;
                else if (matching(str.peek(),x)==false) return false;
                else str.pop();
            }
        }
        return(str.isEmpty()==true);
    }
        boolean matching(char a, char b) {
        return (a == '(' && b == ')') ||
               (a == '{' && b == '}') ||
               (a == '[' && b == ']');
    }
}