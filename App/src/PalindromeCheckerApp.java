```java id="p4k9w2"
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {


                String input = "Level";

                PalindromeStrategy[] strategies = {
                        new StackStrategy(),
                        new DequeStrategy(),
                        new TwoPointerStrategy()
                };

                for (PalindromeStrategy strategy : strategies) {

                    long startTime = System.nanoTime();
                    boolean isPalindrome = strategy.check(input);
                    long endTime = System.nanoTime();
                    long duration = endTime - startTime;

                    System.out.println("Strategy: " + strategy.getClass().getSimpleName());
                    System.out.println("Input: " + input);
                    System.out.println("Is Palindrome?: " + isPalindrome);
                    System.out.println("Execution Time: " + duration + " ns");
                    System.out.println("--------------------------------");
                }
            }
        }

        interface PalindromeStrategy {
            boolean check(String input);
        }

        class StackStrategy implements PalindromeStrategy {

            public boolean check(String input) {
                java.util.Stack<Character> stack = new java.util.Stack<>();
                for (char c : input.toLowerCase().toCharArray()) {
                    stack.push(c);
                }
                for (char c : input.toLowerCase().toCharArray()) {
                    if (c != stack.pop()) return false;
                }
                return true;
            }
        }

        class DequeStrategy implements PalindromeStrategy {

            public boolean check(String input) {
                java.util.Deque<Character> deque = new java.util.ArrayDeque<>();
                for (char c : input.toLowerCase().toCharArray()) {
                    deque.addLast(c);
                }
                while (deque.size() > 1) {
                    if (!deque.removeFirst().equals(deque.removeLast())) return false;
                }
                return true;
            }
        }

        class TwoPointerStrategy implements PalindromeStrategy {

            public boolean check(String input) {
                String s = input.toLowerCase();
                int start = 0, end = s.length() - 1;
                while (start < end) {
                    if (s.charAt(start) != s.charAt(end)) return false;
                    start++;
                    end--;
                }
                return true;
            }
        }