package pro.dmitrypukhov.javaquiz.leetcode;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * Input: num1 = "11", num2 = "123"
 * Output: "134"
 * <p>
 * Example 2:
 * Input: num1 = "456", num2 = "77"
 * Output: "533"
 * <p>
 * Example 3:
 * Input: num1 = "0", num2 = "0"
 * Output: "0"
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= num1.length, num2.length <= 104
 * num1 and num2 consist of only digits.
 * num1 and num2 don't have any leading zeros except for the zero itself.
 * <p>
 * <p>
 * Follow up: Could you solve it without using any built-in BigInteger library or converting the inputs to integer directly?
 */
public class AddStrings {
    public String addStrings(String num1, String num2) {
        // Go through nums, add each digit with respect to carry
        int carry = 0;
        int l1 = num1.length();
        int l2 = num2.length();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < Math.max(num1.length(), num2.length()); i++) {

            int n1 = l1 - i - 1 >= 0 ? (int) num1.charAt(l1 - i - 1) - (int) '0' : 0;
            int n2 = l2 - i - 1 >= 0 ? (int) num2.charAt(l2- i - 1) - (int) '0' : 0;
            int n3 = (n1 + n2 + carry) % 10 ;
            stack.push(n3);
            carry =(n1 + n2 + carry)  / 10;
        }
        // Add final carry if exists
        if (carry > 0) {
            stack.push(carry);
        }
        // Reverse the result
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
