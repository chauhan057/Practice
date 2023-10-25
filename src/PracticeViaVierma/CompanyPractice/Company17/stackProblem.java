package PracticeViaVierma.CompanyPractice.Company17;

import java.util.Stack;

 class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false; // Invalid character or unbalanced parentheses
            }
        }

        return stack.isEmpty(); // If the stack is empty, all parentheses are balanced.
    }

    public static void main(String[] args) {
        String s1 = "({[]})";
        System.out.println(isValid(s1)); // Output: true

        String s2 = "({[}])";
        System.out.println(isValid(s2)); // Output: false
    }
}

