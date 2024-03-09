package main.java.Week1.Stack;
// E 423. Valid Parentheses

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {

        boolean flag = true;
        if (s.length() == 0) {
            return true;
        } else {
            Stack<Character> parantheses = new Stack<Character>();
            int i = 0;
            while (flag == true && i < s.length()) {
                char x = s.charAt(i);
                if (x == '(' || x == '[' || x == '{') parantheses.push(x);
                else if (x == ')' && (!parantheses.empty() && parantheses.peek() == '(')) {
                    parantheses.pop();
                } else if (x == ']' && (!parantheses.empty() && parantheses.peek() == '[')) {
                    parantheses.pop();
                } else if (x == '}' && (!parantheses.empty() && parantheses.peek() == '{')) {
                    parantheses.pop();
                } else {
                    flag = false;
                }
                i++;
            }
            if (!parantheses.empty()) {
                flag = false;
            }

        }
        return flag;
    }
}
