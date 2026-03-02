```java id="p4k9w2"
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {


                String input = "level";

                LinkedList<Character> list = new LinkedList<>();

                for (char c : input.toCharArray()) {
                    list.addLast(c);
                }

                boolean isPalindrome = true;

                while (list.size() > 1) {
                    char front = list.removeFirst();
                    char rear = list.removeLast();

                    if (front != rear) {
                        isPalindrome = false;
                        break;
                    }
                }

                System.out.println("Input: " + input);
                System.out.println("Is Palindrome?: " + isPalindrome);
            }
        }