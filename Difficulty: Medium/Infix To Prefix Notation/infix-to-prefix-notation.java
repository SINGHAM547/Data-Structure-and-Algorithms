class Solution {
    static int precedence(char ch) {
        if (ch == '^') return 3;
        if (ch == '*' || ch == '/') return 2;
        if (ch == '+' || ch == '-') return 1;
        return -1;
    }
    static String infixToPrefix(String s) {
        StringBuilder rev = new StringBuilder(s).reverse();

        for (int i = 0; i < rev.length(); i++) {
            if (rev.charAt(i) == '(')
                rev.setCharAt(i, ')');
            else if (rev.charAt(i) == ')')
                rev.setCharAt(i, '(');
        }

        StringBuilder postfix = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < rev.length(); i++) {
            char ch = rev.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            } else if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    postfix.append(st.pop());
                }
                st.pop();
            } else {
                while (!st.isEmpty()
                        && st.peek() != '('
                        && (precedence(st.peek()) > precedence(ch)
                        || (precedence(st.peek()) == precedence(ch) && ch == '^'))) {
                    postfix.append(st.pop());
                }
                st.push(ch);
            }
        }
        while (!st.isEmpty()) {
            postfix.append(st.pop());
        }
        return postfix.reverse().toString();
    }
}