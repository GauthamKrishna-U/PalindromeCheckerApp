public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        System.out.println("Input text: " + input);

        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Is it a Palindrome? true");
        } else {
            System.out.println("Is it a Palindrome? false");
        }
    }
}