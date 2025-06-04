import java.util.ArrayList;
import java.util.List;

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int balance = 0;
        int start = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                balance++;
            } else {
                balance--;
            }
            
            if (balance == 0) {
                // Found a primitive string from start to i
                String primitive = s.substring(start, i + 1);
                // Remove outer parentheses and append to result
                result.append(primitive.substring(1, primitive.length() - 1));
                start = i + 1;
            }
        }
        
        return result.toString();
    }
}