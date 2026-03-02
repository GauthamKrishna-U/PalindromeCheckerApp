```java id="p4k9w2"
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {


                String input = "level";

                PalindromeStrategy strategy = new StackStrategy(); // change to DequeStrategy if needed

                boolean isPalindrome = strategy.check(input);

                System.out.println("Input: " + input);
                System.out.println("Is Palindrome?: " + isPalindrome);
            }
        }

        interface PalindromeStrategy {
            boolean check(String input);
        }

        class StackStrategy implements PalindromeStrategy {

            public boolean check(String input) {

                java.util.Stack<Character> stack = new java.util.Stack<>();

                for (char c : input.toCharArray()) {
                    stack.push(c);
                }

                for (char c : input.toCharArray()) {
                    if (c != stack.pop()) {
                        return false;
                    }
                }

                return true;
            }
        }

        class DequeStrategy implements PalindromeStrategy {

            public boolean check(String input) {

                java.util.Deque<Character> deque = new java.util.ArrayDeque<>();

                for (char c : input.toCharArray()) {
                    deque.addLast(c);
                }

                while (deque.size() > 1) {
                    if (!deque.removeFirst().equals(deque.removeLast())) {
                        return false;
                    }
                }

                return true;
            }
        }
