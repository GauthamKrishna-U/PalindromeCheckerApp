```java id="p4k9w2"
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {


                String input = "refer";

                Deque<Character> deque = new ArrayDeque<>();

                for (char c : input.toCharArray()) {
                    deque.addLast(c);
                }

                boolean isPalindrome = true;

                while (deque.size() > 1) {
                    char front = deque.removeFirst();
                    char rear = deque.removeLast();

                    if (front != rear) {
                        isPalindrome = false;
                        break;
                    }
                }

                System.out.println("Input: " + input);
                System.out.println("Is Palindrome?: " + isPalindrome);
            }
        }