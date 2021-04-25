package pro.dmitrypukhov.javaquiz.leetcode;

import java.util.*;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "()"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 * <p>
 * Input: s = "(]"
 * Output: false
 * Example 4:
 * <p>
 * Input: s = "([)]"
 * Output: false
 * Example 5:
 * <p>
 * Input: s = "{[]}"
 * Output: true
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 **/
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Set<Character> openBrackets = new HashSet<Character>(Arrays.asList('(', '[', '{'));
        Map<Character, Character> closeMap = Map.of(')', '(', ']', '[', '}', '{');
        for (Character c : s.toCharArray()) {
            if (openBrackets.contains(c)) {
                stack.push(c);
            } else if (closeMap.containsKey(c)) {
                Character openBracket = closeMap.get(c);
                if (stack.isEmpty() || !stack.pop().equals(openBracket)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

